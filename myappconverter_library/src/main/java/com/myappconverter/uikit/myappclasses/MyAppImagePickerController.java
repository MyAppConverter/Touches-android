package com.myappconverter.uikit.myappclasses;

import android.content.Context;
import android.content.Intent;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import android.hardware.Camera;

import android.hardware.Camera.CameraInfo;
import android.hardware.Camera.PictureCallback;

import android.media.MediaRecorder;

import android.os.Environment;

import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import android.widget.RelativeLayout;
import android.widget.Toast;

import com.myappconverter.java.coregraphics.CGAffineTransform;
import com.myappconverter.java.foundations.NSArray;
import com.myappconverter.java.foundations.NSString;

import com.myappconverter.mapping.utils.GenericMainContext;

import com.myappconverter.uikit.util.UIKitEnums.UIImagePickerControllerCameraCaptureMode;
import com.myappconverter.uikit.util.UIKitEnums.UIImagePickerControllerCameraDevice;
import com.myappconverter.uikit.util.UIKitEnums.UIImagePickerControllerCameraFlashMode;
import com.myappconverter.uikit.util.UIKitEnums.UIImagePickerControllerQualityType;
import com.myappconverter.uikit.util.UIKitEnums.UIImagePickerControllerSourceType;

import java.io.File;
import java.io.IOException;

import java.text.SimpleDateFormat;

import java.util.Date;


public class MyAppImagePickerController {
    final static int REQUEST_VIDEO_CAPTURED = 1;
    private UIImagePickerControllerSourceType sourceType;
    private boolean allowsEditing;
    private boolean allowsImageEditing;
    private Object delegate;
    private NSArray mediaTypes;
    private UIImagePickerControllerQualityType videoQuality;
    private double videoMaximumDuration;
    private boolean showsCameraControls;
    private RelativeLayout cameraOverlayView;
    private CGAffineTransform cameraViewTransform;
    private UIImagePickerControllerCameraDevice cameraDevice;
    private UIImagePickerControllerCameraCaptureMode cameraCaptureMode;
    private UIImagePickerControllerCameraFlashMode cameraFlashMode;
    private boolean mInitSuccesful = false;
    private MediaRecorder mMediaRecorder = new MediaRecorder();
    private Camera cameraObject;
    private ShowCamera showCamera;
    private PictureCallback capturedIt = new PictureCallback() {
            @Override
            public void onPictureTaken(byte[] data, Camera camera) {
                Bitmap bitmap = BitmapFactory.decodeByteArray(data, 0,
                        data.length);

                if (bitmap == null) {
                    Toast.makeText(GenericMainContext.getContext(),
                        "not taken", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(GenericMainContext.getContext(), "taken",
                        Toast.LENGTH_SHORT).show();
                }

                cameraObject.startPreview();
            }
        };

    // factory method to instantiate the class
    public static MyAppImagePickerController newInstance() {
        return new MyAppImagePickerController();
    }

    public UIImagePickerControllerSourceType getSourceType() {
        return sourceType;
    }

    public void setSourceType(UIImagePickerControllerSourceType sourceType) {
        this.sourceType = sourceType;
    }

    public boolean getAllowsEditing() {
        return allowsEditing;
    }

    public void setAllowsEditing(boolean allowsEditing) {
        this.allowsEditing = allowsEditing;
    }

    public boolean getAllowsImageEditing() {
        return allowsImageEditing;
    }

    public void setAllowsImageEditing(boolean allowsImageEditing) {
        this.allowsImageEditing = allowsImageEditing;
    }

    public Object getDelegate() {
        return delegate;
    }

    public void setDelegate(Object delegate) {
        this.delegate = delegate;
    }

    public NSArray getMediaTypes() {
        return mediaTypes;
    }

    public void setMediaTypes(NSArray mediaTypes) {
        this.mediaTypes = mediaTypes;
    }

    public UIImagePickerControllerQualityType getVideoQuality() {
        return videoQuality;
    }

    public void setVideoQuality(UIImagePickerControllerQualityType videoQuality) {
        this.videoQuality = videoQuality;
    }

    public double getVideoMaximumDuration() {
        return videoMaximumDuration;
    }

    public void setVideoMaximumDuration(double videoMaximumDuration) {
        this.videoMaximumDuration = videoMaximumDuration;
    }

    public boolean getShowsCameraControls() {
        return showsCameraControls;
    }

    public void setShowsCameraControls(boolean showsCameraControls) {
        this.showsCameraControls = showsCameraControls;
    }

    public RelativeLayout getCameraOverlayView() {
        return cameraOverlayView;
    }

    public void setCameraOverlayView(RelativeLayout cameraOverlayView) {
        this.cameraOverlayView = cameraOverlayView;
    }

    public CGAffineTransform getCameraViewTransform() {
        return cameraViewTransform;
    }

    public void setCameraViewTransform(CGAffineTransform cameraViewTransform) {
        this.cameraViewTransform = cameraViewTransform;
    }

    public UIImagePickerControllerCameraDevice getCameraDevice() {
        return cameraDevice;
    }

    public void setCameraDevice(
        UIImagePickerControllerCameraDevice cameraDevice) {
        this.cameraDevice = cameraDevice;
    }

    public UIImagePickerControllerCameraCaptureMode getCameraCaptureMode() {
        return cameraCaptureMode;
    }

    public void setCameraCaptureMode(
        UIImagePickerControllerCameraCaptureMode cameraCaptureMode) {
        this.cameraCaptureMode = cameraCaptureMode;
    }

    public UIImagePickerControllerCameraFlashMode getCameraFlashMode() {
        return cameraFlashMode;
    }

    public void setCameraFlashMode(
        UIImagePickerControllerCameraFlashMode cameraFlashMode) {
        this.cameraFlashMode = cameraFlashMode;
    }

    public static boolean isCameraAvailable(
        UIImagePickerControllerCameraDevice cameraDevice) {
        boolean backCamera = false;
        boolean frontCamera = false;

        for (int i = 0; i < Camera.getNumberOfCameras(); i++) {
            CameraInfo cameraInfo = new CameraInfo();
            Camera.getCameraInfo(i, cameraInfo);

            switch (cameraInfo.facing) {
            case CameraInfo.CAMERA_FACING_BACK:
                backCamera = true;

                break;

            case CameraInfo.CAMERA_FACING_FRONT:
                frontCamera = true;

                break;
            }
        }

        switch (cameraDevice) {
        case UIImagePickerControllerCameraDeviceRear:

            if (backCamera) {
                return true;
            }

        case UIImagePickerControllerCameraDeviceFront:

            if (frontCamera) {
                return true;
            }
        }

        return false;
    }

    public static boolean isSourceTypeAvailable(
        UIImagePickerControllerSourceType sourceType) {
        // All types are available in android
        return true;
    }

    public boolean startVideoCapture() {
        try {
            initRecorder(showCamera.getHolder().getSurface());
        } catch (IOException e) {
            e.printStackTrace();
        }

        mMediaRecorder.start();

        return mInitSuccesful;
    }

    public void stopVideoCapture() {
        mMediaRecorder.stop();
        mMediaRecorder.reset();

        try {
            initRecorder(showCamera.getHolder().getSurface());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void initRecorder(Surface surface) throws IOException {
        // It is very important to unlock the camera before doing setCamera
        // or it will results in a black preview
        if (cameraObject == null) {
            cameraObject = Camera.open();
            cameraObject.unlock();
        }

        if (mMediaRecorder == null) {
            mMediaRecorder = new MediaRecorder();
        }

        mMediaRecorder.setPreviewDisplay(surface);
        mMediaRecorder.setCamera(cameraObject);

        mMediaRecorder.setVideoSource(MediaRecorder.VideoSource.CAMERA);

        mMediaRecorder.setAudioSource(MediaRecorder.AudioSource.DEFAULT);

        mMediaRecorder.setOutputFormat(MediaRecorder.OutputFormat.DEFAULT);

        mMediaRecorder.setOutputFile(this.initFile().getAbsolutePath());

        // No limit. Don't forget to check the space on disk.
        mMediaRecorder.setMaxDuration(50000);
        mMediaRecorder.setVideoFrameRate(24);
        mMediaRecorder.setVideoSize(1280, 720);
        mMediaRecorder.setVideoEncodingBitRate(3000000);
        mMediaRecorder.setAudioEncodingBitRate(8000);

        mMediaRecorder.setVideoEncoder(MediaRecorder.VideoEncoder.DEFAULT);
        mMediaRecorder.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);

        try {
            mMediaRecorder.prepare();
        } catch (IllegalStateException e) {
            // This is thrown if the previous calls are not called with the
            // proper order
            e.printStackTrace();
        }

        mInitSuccesful = true;
    }

    private File initFile() {
        // File dir = new
        // File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES),
        // this
        File dir = new File(Environment.getExternalStorageDirectory(),
                this.getClass().getPackage().getName());

        File file;

        if (!dir.exists() && !dir.mkdirs()) {
            file = null;
        } else {
            file = new File(dir.getAbsolutePath(),
                    new SimpleDateFormat("'IMG_'yyyyMMddHHmmss'.mp4'").format(
                        new Date()));
        }

        return file;
    }

    public NSArray availableMediaTypesForSourceType(
        UIImagePickerControllerSourceType sourceType) {
        NSArray array = new NSArray<NSString>();

        array.getWrappedList().add(new NSString("kUTTypeImage"));
        array.getWrappedList().add(new NSString("kUTTypeAudio"));
        array.getWrappedList().add(new NSString("kUTTypeVideo"));
        array.getWrappedList().add(new NSString("kUTTypeMovie"));

        return array;
    }

    public void takePicture() {
        try {
            cameraObject.takePicture(null, null, capturedIt);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private class ShowCamera extends SurfaceView implements SurfaceHolder.Callback {
        private SurfaceHolder holdMe;
        private Camera theCamera;

        public ShowCamera(Context context, Camera camera) {
            super(context);
            theCamera = camera;
            holdMe = getHolder();
            holdMe.addCallback(this);
        }

        @Override
        public void surfaceChanged(SurfaceHolder arg0, int arg1, int arg2,
            int arg3) {
        }

        @Override
        public void surfaceCreated(SurfaceHolder holder) {
            try {
                theCamera.setPreviewDisplay(holder);
                theCamera.startPreview();
            } catch (IOException e) {
            }
        }

        @Override
        public void surfaceDestroyed(SurfaceHolder arg0) {
        }
    }
}
