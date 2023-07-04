package expo.modules.imagepicker;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.adyen.checkout.components.status.model.StatusResponse;
import com.facebook.react.bridge.BaseJavaModule;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import expo.modules.core.ExportedModule;
import expo.modules.core.ModuleRegistry;
import expo.modules.core.ModuleRegistryDelegate;
import expo.modules.core.Promise;
import expo.modules.core.errors.ModuleDestroyedException;
import expo.modules.core.interfaces.ActivityEventListener;
import expo.modules.core.interfaces.ActivityProvider;
import expo.modules.core.interfaces.ExpoMethod;
import expo.modules.core.interfaces.LifecycleEventListener;
import expo.modules.core.interfaces.services.UIManager;
import expo.modules.interfaces.imageloader.ImageLoaderInterface;
import expo.modules.interfaces.permissions.Permissions;
import expo.modules.interfaces.permissions.PermissionsResponse;
import expo.modules.interfaces.permissions.PermissionsResponseListener;
import expo.modules.interfaces.permissions.PermissionsStatus;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import v20.e1;
import v20.o0;
import v20.p0;
import vz.k;
import vz.m;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B#\u0012\u0006\u00109\u001a\u000208\u0012\b\b\u0002\u0010<\u001a\u00020;\u0012\b\b\u0002\u0010?\u001a\u00020>¢\u0006\u0004\bg\u0010hJ\u001f\u0010\u0007\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00018\u00008\u00000\u0005\"\u0006\b\u0000\u0010\u0004\u0018\u0001H\u0082\bJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J0\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J(\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0018\u0010!\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002J:\u0010#\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010$\u001a\u00020\u0014H\u0016J\u0010\u0010&\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020%H\u0016J\b\u0010'\u001a\u00020\u000bH\u0016J\u0018\u0010(\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007J\u0018\u0010)\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007J\u0010\u0010*\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000eH\u0007J\u0010\u0010+\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000eH\u0007J\u0010\u0010,\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000eH\u0007J&\u00100\u001a\u00020\u00142\u0014\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010.0-2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007J&\u00101\u001a\u00020\u00142\u0014\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010.0-2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007J\u0010\u00102\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u0010H\u0016J*\u00104\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\u001c2\b\u00103\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u00105\u001a\u00020\u0014H\u0016J\b\u00106\u001a\u00020\u0014H\u0016J\b\u00107\u001a\u00020\u0014H\u0016R\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010<\u001a\u00020;8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010?\u001a\u00020>8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010A\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010C\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010E\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010H\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010J\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u001c\u0010M\u001a\b\u0012\u0004\u0012\u00020\u001f0L8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bM\u0010NR\u001d\u0010T\u001a\u00020O8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u001d\u0010Y\u001a\u00020U8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bV\u0010Q\u001a\u0004\bW\u0010XR\u001d\u0010^\u001a\u00020Z8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b[\u0010Q\u001a\u0004\b\\\u0010]R\u001d\u0010c\u001a\u00020_8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b`\u0010Q\u001a\u0004\ba\u0010bR\u0018\u0010f\u001a\u0004\u0018\u00010\u001f8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bd\u0010e¨\u0006i"}, d2 = {"Lexpo/modules/imagepicker/ImagePickerModule;", "Lexpo/modules/core/ExportedModule;", "Lexpo/modules/core/interfaces/ActivityEventListener;", "Lexpo/modules/core/interfaces/LifecycleEventListener;", "T", "Lvz/k;", "kotlin.jvm.PlatformType", "moduleRegistry", "", "writeOnly", "", "", "getMediaLibraryPermissions", "(Z)[Ljava/lang/String;", "Lexpo/modules/core/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Landroid/content/Intent;", "cameraIntent", "Lexpo/modules/imagepicker/ImagePickerOptions;", "pickerOptions", "Lvz/b0;", "launchCameraWithPermissionsGranted", "Landroid/net/Uri;", "uri", "type", "needGenerateFile", "startCropIntent", "intent", "", "requestCode", "startActivityOnResult", "Landroid/app/Activity;", "activity", "shouldHandleOnActivityResult", StatusResponse.RESULT_CODE, "handleOnActivityResult", "onDestroy", "Lexpo/modules/core/ModuleRegistry;", "onCreate", "getName", "requestMediaLibraryPermissionsAsync", "getMediaLibraryPermissionsAsync", "requestCameraPermissionsAsync", "getCameraPermissionsAsync", "getPendingResultAsync", "", "", "options", "launchCameraAsync", "launchImageLibraryAsync", "onNewIntent", MessageExtension.FIELD_DATA, "onActivityResult", "onHostDestroy", "onHostResume", "onHostPause", "Landroid/content/Context;", "mContext", "Landroid/content/Context;", "Lexpo/modules/core/ModuleRegistryDelegate;", "moduleRegistryDelegate", "Lexpo/modules/core/ModuleRegistryDelegate;", "Lexpo/modules/imagepicker/PickerResultsStore;", "pickerResultStore", "Lexpo/modules/imagepicker/PickerResultsStore;", "mCameraCaptureURI", "Landroid/net/Uri;", "mPromise", "Lexpo/modules/core/Promise;", "mPickerOptions", "Lexpo/modules/imagepicker/ImagePickerOptions;", "Lexpo/modules/imagepicker/ExifDataHandler;", "exifDataHandler", "Lexpo/modules/imagepicker/ExifDataHandler;", "mWasHostDestroyed", "Z", "Ljava/lang/ref/WeakReference;", "_experienceActivity", "Ljava/lang/ref/WeakReference;", "Lexpo/modules/interfaces/imageloader/ImageLoaderInterface;", "mImageLoader$delegate", "Lvz/k;", "getMImageLoader", "()Lexpo/modules/interfaces/imageloader/ImageLoaderInterface;", "mImageLoader", "Lexpo/modules/core/interfaces/services/UIManager;", "mUIManager$delegate", "getMUIManager", "()Lexpo/modules/core/interfaces/services/UIManager;", "mUIManager", "Lexpo/modules/interfaces/permissions/Permissions;", "mPermissions$delegate", "getMPermissions", "()Lexpo/modules/interfaces/permissions/Permissions;", "mPermissions", "Lexpo/modules/core/interfaces/ActivityProvider;", "mActivityProvider$delegate", "getMActivityProvider", "()Lexpo/modules/core/interfaces/ActivityProvider;", "mActivityProvider", "getExperienceActivity", "()Landroid/app/Activity;", "experienceActivity", "<init>", "(Landroid/content/Context;Lexpo/modules/core/ModuleRegistryDelegate;Lexpo/modules/imagepicker/PickerResultsStore;)V", "expo-image-picker_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class ImagePickerModule extends ExportedModule implements ActivityEventListener, LifecycleEventListener {
    private WeakReference<Activity> _experienceActivity;
    private ExifDataHandler exifDataHandler;
    private final k mActivityProvider$delegate;
    private Uri mCameraCaptureURI;
    private final Context mContext;
    private final k mImageLoader$delegate;
    private final k mPermissions$delegate;
    private ImagePickerOptions mPickerOptions;
    private Promise mPromise;
    private final k mUIManager$delegate;
    private boolean mWasHostDestroyed;
    private final o0 moduleCoroutineScope;
    private final ModuleRegistryDelegate moduleRegistryDelegate;
    private final PickerResultsStore pickerResultStore;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    /* loaded from: classes5.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MediaTypes.values().length];
            iArr[MediaTypes.IMAGES.ordinal()] = 1;
            iArr[MediaTypes.VIDEOS.ordinal()] = 2;
            iArr[MediaTypes.ALL.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ ImagePickerModule(Context context, ModuleRegistryDelegate moduleRegistryDelegate, PickerResultsStore pickerResultsStore, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? new ModuleRegistryDelegate() : moduleRegistryDelegate, (i11 & 4) != 0 ? new PickerResultsStore(context) : pickerResultsStore);
    }

    public static /* synthetic */ void a(ImagePickerModule imagePickerModule, Promise promise, Intent intent, ImagePickerOptions imagePickerOptions, Map map) {
        m606launchCameraAsync$lambda2(imagePickerModule, promise, intent, imagePickerOptions, map);
    }

    private final Activity getExperienceActivity() {
        if (this._experienceActivity == null) {
            this._experienceActivity = new WeakReference<>(getMActivityProvider().getCurrentActivity());
        }
        WeakReference<Activity> weakReference = this._experienceActivity;
        if (weakReference == null) {
            s.x("_experienceActivity");
            weakReference = null;
        }
        return weakReference.get();
    }

    private final ActivityProvider getMActivityProvider() {
        Object value = this.mActivityProvider$delegate.getValue();
        s.f(value, "<get-mActivityProvider>(...)");
        return (ActivityProvider) value;
    }

    private final ImageLoaderInterface getMImageLoader() {
        Object value = this.mImageLoader$delegate.getValue();
        s.f(value, "<get-mImageLoader>(...)");
        return (ImageLoaderInterface) value;
    }

    private final Permissions getMPermissions() {
        Object value = this.mPermissions$delegate.getValue();
        s.f(value, "<get-mPermissions>(...)");
        return (Permissions) value;
    }

    private final UIManager getMUIManager() {
        Object value = this.mUIManager$delegate.getValue();
        s.f(value, "<get-mUIManager>(...)");
        return (UIManager) value;
    }

    private final String[] getMediaLibraryPermissions(boolean z11) {
        if (z11) {
            return new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"};
        }
        return new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void handleOnActivityResult(expo.modules.core.Promise r19, android.app.Activity r20, int r21, int r22, android.content.Intent r23, expo.modules.imagepicker.ImagePickerOptions r24) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: expo.modules.imagepicker.ImagePickerModule.handleOnActivityResult(expo.modules.core.Promise, android.app.Activity, int, int, android.content.Intent, expo.modules.imagepicker.ImagePickerOptions):void");
    }

    /* renamed from: launchCameraAsync$lambda-2 */
    public static final void m606launchCameraAsync$lambda2(ImagePickerModule this$0, Promise promise, Intent cameraIntent, ImagePickerOptions pickerOptions, Map permissionsResponse) {
        s.g(this$0, "this$0");
        s.g(promise, "$promise");
        s.g(cameraIntent, "$cameraIntent");
        s.g(pickerOptions, "$pickerOptions");
        s.g(permissionsResponse, "permissionsResponse");
        PermissionsResponse permissionsResponse2 = (PermissionsResponse) permissionsResponse.get("android.permission.WRITE_EXTERNAL_STORAGE");
        PermissionsStatus status = permissionsResponse2 == null ? null : permissionsResponse2.getStatus();
        PermissionsStatus permissionsStatus = PermissionsStatus.GRANTED;
        if (status == permissionsStatus) {
            PermissionsResponse permissionsResponse3 = (PermissionsResponse) permissionsResponse.get("android.permission.CAMERA");
            if ((permissionsResponse3 != null ? permissionsResponse3.getStatus() : null) == permissionsStatus) {
                this$0.launchCameraWithPermissionsGranted(promise, cameraIntent, pickerOptions);
                return;
            }
        }
        promise.reject(new SecurityException("User rejected permissions"));
    }

    private final void launchCameraWithPermissionsGranted(Promise promise, Intent intent, ImagePickerOptions imagePickerOptions) {
        File cacheDir = this.mContext.getCacheDir();
        s.f(cacheDir, "mContext.cacheDir");
        File createOutputFile = ImagePickerUtilsKt.createOutputFile(cacheDir, imagePickerOptions.getMediaTypes() == MediaTypes.VIDEOS ? ".mp4" : ".jpg");
        if (createOutputFile == null) {
            promise.reject(new IOException("Could not create image file."));
            return;
        }
        this.mCameraCaptureURI = ImagePickerUtilsKt.uriFromFile(createOutputFile);
        Activity experienceActivity = getExperienceActivity();
        if (experienceActivity == null) {
            promise.reject(ImagePickerConstants.ERR_MISSING_ACTIVITY, ImagePickerConstants.MISSING_ACTIVITY_MESSAGE);
            return;
        }
        this.mPromise = promise;
        this.mPickerOptions = imagePickerOptions;
        if (imagePickerOptions.getVideoMaxDuration() > 0) {
            intent.putExtra("android.intent.extra.durationLimit", imagePickerOptions.getVideoMaxDuration());
        }
        Application application = experienceActivity.getApplication();
        s.f(application, "activity.application");
        intent.putExtra("output", ImagePickerUtilsKt.contentUriFromFile(createOutputFile, application));
        startActivityOnResult(intent, 1, promise, imagePickerOptions);
    }

    private final /* synthetic */ <T> k<T> moduleRegistry() {
        k<T> a11;
        ModuleRegistryDelegate moduleRegistryDelegate = this.moduleRegistryDelegate;
        s.l();
        a11 = m.a(new ImagePickerModule$moduleRegistry$$inlined$getFromModuleRegistry$1(moduleRegistryDelegate));
        return a11;
    }

    private final boolean shouldHandleOnActivityResult(Activity activity, int i11) {
        return (getExperienceActivity() == null || this.mPromise == null || this.mPickerOptions == null || (activity != getExperienceActivity() && (!this.mWasHostDestroyed || i11 != 203))) ? false : true;
    }

    private final void startActivityOnResult(Intent intent, int i11, Promise promise, ImagePickerOptions imagePickerOptions) {
        Activity experienceActivity = getExperienceActivity();
        if (experienceActivity == null) {
            promise.reject(ImagePickerConstants.ERR_MISSING_ACTIVITY, ImagePickerConstants.MISSING_ACTIVITY_MESSAGE);
            return;
        }
        getMUIManager().registerActivityEventListener(this);
        this.mPromise = promise;
        this.mPickerOptions = imagePickerOptions;
        experienceActivity.startActivityForResult(intent, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x003c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void startCropIntent(expo.modules.core.Promise r8, android.net.Uri r9, java.lang.String r10, boolean r11, expo.modules.imagepicker.ImagePickerOptions r12) {
        /*
            r7 = this;
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG
            java.lang.String r1 = "png"
            r2 = 0
            r3 = 2
            r4 = 0
            boolean r1 = kotlin.text.m.M(r10, r1, r2, r3, r4)
            java.lang.String r5 = ".jpg"
            java.lang.String r6 = ".png"
            if (r1 == 0) goto L15
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.PNG
        L13:
            r5 = r6
            goto L3a
        L15:
            java.lang.String r1 = "gif"
            boolean r1 = kotlin.text.m.M(r10, r1, r2, r3, r4)
            if (r1 == 0) goto L20
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.PNG
            goto L13
        L20:
            java.lang.String r1 = "bmp"
            boolean r1 = kotlin.text.m.M(r10, r1, r2, r3, r4)
            if (r1 == 0) goto L2b
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.PNG
            goto L13
        L2b:
            java.lang.String r1 = "jpeg"
            boolean r10 = kotlin.text.m.M(r10, r1, r2, r3, r4)
            if (r10 != 0) goto L3a
            java.lang.String r10 = "ExponentImagePicker"
            java.lang.String r1 = "Image type not supported. Falling back to JPEG instead."
            android.util.Log.w(r10, r1)
        L3a:
            if (r11 == 0) goto L5b
            android.content.Context r10 = r7.mContext     // Catch: java.io.IOException -> L52
            java.io.File r10 = r10.getCacheDir()     // Catch: java.io.IOException -> L52
            java.lang.String r11 = "ImagePicker"
            java.lang.String r10 = expo.modules.core.utilities.FileUtilities.generateOutputPath(r10, r11, r5)     // Catch: java.io.IOException -> L52
            java.lang.String r11 = "generateOutputPath(mCont…ACHE_DIR_NAME, extension)"
            kotlin.jvm.internal.s.f(r10, r11)     // Catch: java.io.IOException -> L52
            android.net.Uri r10 = expo.modules.imagepicker.ImagePickerUtilsKt.uriFromFilePath(r10)     // Catch: java.io.IOException -> L52
            goto L5c
        L52:
            r9 = move-exception
            java.lang.String r10 = "ERR_CAN_NOT_OPEN_CROP"
            java.lang.String r11 = "Can not open the crop tool."
            r8.reject(r10, r11, r9)
            return
        L5b:
            r10 = r9
        L5c:
            com.canhub.cropper.d$b r11 = com.canhub.cropper.d.a(r9)
            java.util.List r1 = r12.getForceAspect()
            if (r1 != 0) goto L67
            goto L8e
        L67:
            java.lang.Object r2 = r1.get(r2)
            r3 = 1
            java.lang.Object r1 = r1.get(r3)
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.Number"
            java.util.Objects.requireNonNull(r2, r4)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.util.Objects.requireNonNull(r1, r4)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r11.c(r2, r1)
            r11.d(r3)
            r1 = 0
            r11.e(r1)
        L8e:
            r11.h(r10)
            r11.f(r0)
            int r10 = r12.getQuality()
            r11.g(r10)
            expo.modules.imagepicker.ExifDataHandler r10 = new expo.modules.imagepicker.ExifDataHandler
            r10.<init>(r9)
            r7.exifDataHandler = r10
            android.content.Context r9 = r7.getContext()
            android.content.Intent r9 = r11.a(r9)
            java.lang.String r10 = "cropImageBuilder.getIntent(context)"
            kotlin.jvm.internal.s.f(r9, r10)
            r10 = 203(0xcb, float:2.84E-43)
            r7.startActivityOnResult(r9, r10, r8, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: expo.modules.imagepicker.ImagePickerModule.startCropIntent(expo.modules.core.Promise, android.net.Uri, java.lang.String, boolean, expo.modules.imagepicker.ImagePickerOptions):void");
    }

    @ExpoMethod
    public final void getCameraPermissionsAsync(Promise promise) {
        s.g(promise, "promise");
        Permissions.getPermissionsWithPermissionsManager(getMPermissions(), promise, "android.permission.CAMERA");
    }

    @ExpoMethod
    public final void getMediaLibraryPermissionsAsync(boolean z11, Promise promise) {
        s.g(promise, "promise");
        Permissions mPermissions = getMPermissions();
        String[] mediaLibraryPermissions = getMediaLibraryPermissions(z11);
        Permissions.getPermissionsWithPermissionsManager(mPermissions, promise, (String[]) Arrays.copyOf(mediaLibraryPermissions, mediaLibraryPermissions.length));
    }

    @Override // expo.modules.core.ExportedModule
    public String getName() {
        return ImagePickerConstants.TAG;
    }

    @ExpoMethod
    public final void getPendingResultAsync(Promise promise) {
        s.g(promise, "promise");
        promise.resolve(this.pickerResultStore.getAllPendingResults());
    }

    @ExpoMethod
    public final void launchCameraAsync(Map<String, ? extends Object> options, final Promise promise) {
        s.g(options, "options");
        s.g(promise, "promise");
        final ImagePickerOptions optionsFromMap = ImagePickerOptions.Companion.optionsFromMap(options, promise);
        if (optionsFromMap == null) {
            return;
        }
        Activity experienceActivity = getExperienceActivity();
        if (experienceActivity == null) {
            promise.reject(ImagePickerConstants.ERR_MISSING_ACTIVITY, ImagePickerConstants.MISSING_ACTIVITY_MESSAGE);
            return;
        }
        final Intent intent = new Intent(optionsFromMap.getMediaTypes() == MediaTypes.VIDEOS ? "android.media.action.VIDEO_CAPTURE" : "android.media.action.IMAGE_CAPTURE");
        if (intent.resolveActivity(experienceActivity.getApplication().getPackageManager()) == null) {
            promise.reject(new IllegalStateException("Error resolving activity"));
        } else {
            getMPermissions().askForPermissions(new PermissionsResponseListener() { // from class: expo.modules.imagepicker.a
                {
                    ImagePickerModule.this = this;
                }

                @Override // expo.modules.interfaces.permissions.PermissionsResponseListener
                public final void onResult(Map map) {
                    ImagePickerModule.a(ImagePickerModule.this, promise, intent, optionsFromMap, map);
                }
            }, "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.CAMERA");
        }
    }

    @ExpoMethod
    public final void launchImageLibraryAsync(Map<String, ? extends Object> options, Promise promise) {
        s.g(options, "options");
        s.g(promise, "promise");
        ImagePickerOptions optionsFromMap = ImagePickerOptions.Companion.optionsFromMap(options, promise);
        if (optionsFromMap == null) {
            return;
        }
        Intent intent = new Intent();
        int i11 = WhenMappings.$EnumSwitchMapping$0[optionsFromMap.getMediaTypes().ordinal()];
        if (i11 == 1) {
            intent.setType("image/*");
        } else if (i11 == 2) {
            intent.setType("video/*");
        } else if (i11 == 3) {
            intent.setType("*/*");
            intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
        }
        intent.setAction("android.intent.action.GET_CONTENT");
        startActivityOnResult(intent, 2, promise, optionsFromMap);
    }

    @Override // expo.modules.core.interfaces.ActivityEventListener
    public void onActivityResult(Activity activity, int i11, int i12, Intent intent) {
        Promise promise;
        ImagePickerOptions imagePickerOptions;
        ImagePickerOptions imagePickerOptions2;
        PendingPromise pendingPromise;
        s.g(activity, "activity");
        if (shouldHandleOnActivityResult(activity, i11)) {
            getMUIManager().unregisterActivityEventListener(this);
            ImagePickerOptions imagePickerOptions3 = this.mPickerOptions;
            s.e(imagePickerOptions3);
            if (this.mWasHostDestroyed && !(this.mPromise instanceof PendingPromise)) {
                if (imagePickerOptions3.isBase64()) {
                    imagePickerOptions2 = new ImagePickerOptions(imagePickerOptions3.getQuality(), imagePickerOptions3.isAllowsEditing(), imagePickerOptions3.getForceAspect(), false, imagePickerOptions3.getMediaTypes(), imagePickerOptions3.isExif(), imagePickerOptions3.getVideoMaxDuration());
                    pendingPromise = new PendingPromise(this.pickerResultStore, true);
                } else {
                    imagePickerOptions2 = imagePickerOptions3;
                    pendingPromise = new PendingPromise(this.pickerResultStore, false, 2, null);
                }
                imagePickerOptions = imagePickerOptions2;
                promise = pendingPromise;
            } else {
                promise = this.mPromise;
                s.e(promise);
                imagePickerOptions = imagePickerOptions3;
            }
            this.mPromise = null;
            this.mPickerOptions = null;
            handleOnActivityResult(promise, activity, i11, i12, intent, imagePickerOptions);
        }
    }

    @Override // expo.modules.core.interfaces.RegistryLifecycleListener
    public void onCreate(ModuleRegistry moduleRegistry) {
        s.g(moduleRegistry, "moduleRegistry");
        this.moduleRegistryDelegate.onCreate(moduleRegistry);
        getMUIManager().registerLifecycleEventListener(this);
    }

    @Override // expo.modules.core.interfaces.RegistryLifecycleListener
    public void onDestroy() {
        try {
            getMUIManager().unregisterLifecycleEventListener(this);
            p0.c(this.moduleCoroutineScope, new ModuleDestroyedException(ImagePickerConstants.PROMISES_CANCELED));
        } catch (IllegalStateException unused) {
            Log.e(ImagePickerConstants.TAG, "The scope does not have a job in it");
        }
    }

    @Override // expo.modules.core.interfaces.LifecycleEventListener
    public void onHostDestroy() {
        this.mWasHostDestroyed = true;
    }

    @Override // expo.modules.core.interfaces.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // expo.modules.core.interfaces.LifecycleEventListener
    public void onHostResume() {
        if (this.mWasHostDestroyed) {
            this._experienceActivity = new WeakReference<>(getMActivityProvider().getCurrentActivity());
            this.mWasHostDestroyed = false;
        }
    }

    @Override // expo.modules.core.interfaces.ActivityEventListener
    public void onNewIntent(Intent intent) {
        s.g(intent, "intent");
    }

    @ExpoMethod
    public final void requestCameraPermissionsAsync(Promise promise) {
        s.g(promise, "promise");
        Permissions.askForPermissionsWithPermissionsManager(getMPermissions(), promise, "android.permission.CAMERA");
    }

    @ExpoMethod
    public final void requestMediaLibraryPermissionsAsync(boolean z11, Promise promise) {
        s.g(promise, "promise");
        Permissions mPermissions = getMPermissions();
        String[] mediaLibraryPermissions = getMediaLibraryPermissions(z11);
        Permissions.askForPermissionsWithPermissionsManager(mPermissions, promise, (String[]) Arrays.copyOf(mediaLibraryPermissions, mediaLibraryPermissions.length));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImagePickerModule(Context mContext, ModuleRegistryDelegate moduleRegistryDelegate, PickerResultsStore pickerResultStore) {
        super(mContext);
        k a11;
        k a12;
        k a13;
        k a14;
        s.g(mContext, "mContext");
        s.g(moduleRegistryDelegate, "moduleRegistryDelegate");
        s.g(pickerResultStore, "pickerResultStore");
        this.mContext = mContext;
        this.moduleRegistryDelegate = moduleRegistryDelegate;
        this.pickerResultStore = pickerResultStore;
        this.moduleCoroutineScope = p0.a(e1.b());
        a11 = m.a(new ImagePickerModule$special$$inlined$moduleRegistry$1(this.moduleRegistryDelegate));
        this.mImageLoader$delegate = a11;
        a12 = m.a(new ImagePickerModule$special$$inlined$moduleRegistry$2(this.moduleRegistryDelegate));
        this.mUIManager$delegate = a12;
        a13 = m.a(new ImagePickerModule$special$$inlined$moduleRegistry$3(this.moduleRegistryDelegate));
        this.mPermissions$delegate = a13;
        a14 = m.a(new ImagePickerModule$special$$inlined$moduleRegistry$4(this.moduleRegistryDelegate));
        this.mActivityProvider$delegate = a14;
    }
}