package expo.modules.filesystem;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import android.util.Log;
import androidx.core.content.FileProvider;
import ch.qos.logback.classic.pattern.CallerDataConverter;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.adyen.checkout.components.status.model.StatusResponse;
import com.facebook.react.bridge.BaseJavaModule;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import e00.b;
import expo.modules.constants.ExponentInstallationId;
import expo.modules.core.ExportedModule;
import expo.modules.core.ModuleRegistry;
import expo.modules.core.ModuleRegistryDelegate;
import expo.modules.core.Promise;
import expo.modules.core.interfaces.ActivityEventListener;
import expo.modules.core.interfaces.ActivityProvider;
import expo.modules.core.interfaces.ExpoMethod;
import expo.modules.core.interfaces.services.EventEmitter;
import expo.modules.core.interfaces.services.UIManager;
import expo.modules.filesystem.FileSystemModule;
import expo.modules.filesystem.UploadType;
import expo.modules.imagepicker.ImagePickerConstants;
import expo.modules.interfaces.filesystem.FilePermissionModuleInterface;
import expo.modules.interfaces.filesystem.Permission;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.CookieHandler;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.s;
import kotlin.text.v;
import kotlin.text.w;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Headers;
import okhttp3.JavaNetCookieJar;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.c0;
import okio.e0;
import okio.f;
import okio.g;
import okio.h;
import okio.l;
import okio.r;
import org.spongycastle.cms.CMSAttributeTableGenerator;
import u30.d;
import vz.b0;
import vz.k;
import vz.m;
import wz.s0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\f\u008c\u0001\u008d\u0001\u008e\u0001\u008f\u0001\u0090\u0001\u0091\u0001B\u001d\u0012\b\u0010\u0089\u0001\u001a\u00030\u0088\u0001\u0012\b\b\u0002\u0010r\u001a\u00020q¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\u001f\u0010\u0006\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00018\u00008\u00000\u0004\"\u0006\b\u0000\u0010\u0003\u0018\u0001H\u0082\bJ\f\u0010\t\u001a\u00020\b*\u00020\u0007H\u0002J\f\u0010\n\u001a\u00020\b*\u00020\u0007H\u0002J\u001a\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002J\u0018\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u0007H\u0002J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0010\u001a\u00020\u0007H\u0002J \u0010\u0015\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000bH\u0002J\u0018\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u000eH\u0002J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u0007H\u0002J\u0012\u0010\u0019\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u000bH\u0002J \u0010 \u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002J\u0010\u0010\"\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u001cH\u0002J>\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u000b2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020&0%2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*H\u0002J.\u0010/\u001a\u0004\u0018\u00010.2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020&0%2\u0006\u0010+\u001a\u00020*2\u0006\u0010!\u001a\u00020\u001cH\u0002J\u0010\u00100\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u001cH\u0002J\u0010\u00102\u001a\u00020\b2\u0006\u00101\u001a\u00020\u001cH\u0002J\u0010\u00103\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u001cH\u0002J\u0010\u00105\u001a\u0002042\u0006\u0010!\u001a\u00020\u001cH\u0002J \u00106\u001a\u00020\u000b2\u0016\u0010'\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010&0%H\u0002J\u0010\u00107\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u0007H\u0002J\u0010\u00109\u001a\u0002082\u0006\u0010\u0010\u001a\u00020\u0007H\u0002J\u0012\u0010:\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0010\u001a\u00020\u0007H\u0002J\f\u0010;\u001a\u00020\u001c*\u00020\u0007H\u0002J\u0010\u0010=\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020\u000bH\u0002J\u0010\u0010@\u001a\u00020?2\u0006\u0010>\u001a\u00020\u0016H\u0002J\u0010\u0010D\u001a\u00020C2\u0006\u0010B\u001a\u00020AH\u0002J\u0010\u0010F\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020EH\u0016J\b\u0010G\u001a\u00020\u000bH\u0016J\u0016\u0010H\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010&0%H\u0016J0\u0010J\u001a\u00020\b2\u0006\u0010I\u001a\u00020\u000b2\u0016\u0010'\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010&0%2\u0006\u0010)\u001a\u00020(H\u0007J2\u0010K\u001a\u00020\b2\b\u0010<\u001a\u0004\u0018\u00010\u000b2\u0016\u0010'\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010&0%2\u0006\u0010)\u001a\u00020(H\u0007J<\u0010M\u001a\u00020\b2\b\u0010<\u001a\u0004\u0018\u00010\u000b2\b\u0010L\u001a\u0004\u0018\u00010\u000b2\u0016\u0010'\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010&0%2\u0006\u0010)\u001a\u00020(H\u0007J2\u0010N\u001a\u00020\b2\b\u0010<\u001a\u0004\u0018\u00010\u000b2\u0016\u0010'\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010&0%2\u0006\u0010)\u001a\u00020(H\u0007J(\u0010O\u001a\u00020\b2\u0016\u0010'\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010&0%2\u0006\u0010)\u001a\u00020(H\u0007J(\u0010P\u001a\u00020\b2\u0016\u0010'\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010&0%2\u0006\u0010)\u001a\u00020(H\u0007J2\u0010Q\u001a\u00020\b2\b\u0010<\u001a\u0004\u0018\u00010\u000b2\u0016\u0010'\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010&0%2\u0006\u0010)\u001a\u00020(H\u0007J4\u0010R\u001a\u00020\b2\b\u0010<\u001a\u0004\u0018\u00010\u000b2\u0018\u0010'\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010&\u0018\u00010%2\u0006\u0010)\u001a\u00020(H\u0007J\u0010\u0010S\u001a\u00020\b2\u0006\u0010)\u001a\u00020(H\u0007J\u0010\u0010T\u001a\u00020\b2\u0006\u0010)\u001a\u00020(H\u0007J\u0018\u0010U\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020(H\u0007J4\u0010V\u001a\u00020\b2\b\u0010<\u001a\u0004\u0018\u00010\u000b2\u0018\u0010'\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010&\u0018\u00010%2\u0006\u0010)\u001a\u00020(H\u0007J$\u0010X\u001a\u00020\b2\b\u0010<\u001a\u0004\u0018\u00010\u000b2\b\u0010W\u001a\u0004\u0018\u00010\u000b2\u0006\u0010)\u001a\u00020(H\u0007J.\u0010[\u001a\u00020\b2\b\u0010<\u001a\u0004\u0018\u00010\u000b2\b\u0010Y\u001a\u0004\u0018\u00010\u000b2\b\u0010Z\u001a\u0004\u0018\u00010\u000b2\u0006\u0010)\u001a\u00020(H\u0007J\u001a\u0010]\u001a\u00020\b2\b\u0010\\\u001a\u0004\u0018\u00010\u000b2\u0006\u0010)\u001a\u00020(H\u0007J4\u0010^\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u000b2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020&0%2\u0006\u0010)\u001a\u00020(H\u0007J<\u0010`\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u000b2\u0006\u0010_\u001a\u00020\u000b2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020&0%2\u0006\u0010)\u001a\u00020(H\u0007J<\u0010a\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u000b2\b\u0010<\u001a\u0004\u0018\u00010\u000b2\u0018\u0010'\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010&\u0018\u00010%2\u0006\u0010)\u001a\u00020(H\u0007J\u0018\u0010b\u001a\u00020\b2\u0006\u0010_\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020(H\u0007JJ\u0010e\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010c\u001a\u00020\u000b2\u0006\u0010_\u001a\u00020\u000b2\u0016\u0010'\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010&0%2\b\u0010d\u001a\u0004\u0018\u00010\u000b2\u0006\u0010)\u001a\u00020(H\u0007J\u0018\u0010f\u001a\u00020\b2\u0006\u0010_\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020(H\u0007J*\u0010n\u001a\u00020\b2\u0006\u0010h\u001a\u00020g2\u0006\u0010j\u001a\u00020i2\u0006\u0010k\u001a\u00020i2\b\u0010m\u001a\u0004\u0018\u00010lH\u0017J\u0010\u0010p\u001a\u00020\b2\u0006\u0010o\u001a\u00020lH\u0016R\u0016\u0010r\u001a\u00020q8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u0018\u0010u\u001a\u0004\u0018\u00010t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\u0018\u0010w\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010xR\"\u0010{\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020z0y8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R \u0010\u0082\u0001\u001a\u00020}8B@\u0002X\u0082\u0084\u0002¢\u0006\u000e\n\u0004\b~\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001b\u0010\u0085\u0001\u001a\u0004\u0018\u00010t8B@\u0002X\u0082\u0004¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001d\u0010\u0086\u0001\u001a\u00020\u001e*\u00020\u00078B@\u0002X\u0082\u0004¢\u0006\b\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001¨\u0006\u0098\u0001²\u0006\u0010\u0010\u0093\u0001\u001a\u00030\u0092\u00018\n@\nX\u008a\u0084\u0002²\u0006\u0010\u0010\u0095\u0001\u001a\u00030\u0094\u00018\n@\nX\u008a\u0084\u0002²\u0006\u0010\u0010\u0095\u0001\u001a\u00030\u0094\u00018\n@\nX\u008a\u0084\u0002²\u0006\u0010\u0010\u0097\u0001\u001a\u00030\u0096\u00018\n@\nX\u008a\u0084\u0002"}, d2 = {"Lexpo/modules/filesystem/FileSystemModule;", "Lexpo/modules/core/ExportedModule;", "Lexpo/modules/core/interfaces/ActivityEventListener;", "T", "Lvz/k;", "kotlin.jvm.PlatformType", "moduleRegistry", "Landroid/net/Uri;", "Lvz/b0;", "checkIfFileExists", "checkIfFileDirExists", "", "path", "Ljava/util/EnumSet;", "Lexpo/modules/interfaces/filesystem/Permission;", "permissionsForPath", "uri", "permissionsForUri", "permissionsForSAFUri", "permission", "errorMsg", "ensurePermission", "Ljava/io/InputStream;", "openAssetInputStream", "resourceName", "openResourceInputStream", "Lc4/a;", "documentFile", "Ljava/io/File;", "outputDir", "", "copy", "transformFilesFromSAF", Action.FILE_ATTRIBUTE, "contentUriFromFile", "url", "fileUriString", "", "", "options", "Lexpo/modules/core/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lexpo/modules/filesystem/RequestBodyDecorator;", "decorator", "Lokhttp3/Request;", "createUploadRequest", "Lokhttp3/RequestBody;", "createRequestBody", "md5", "dir", "ensureDirExists", "forceDelete", "", "getFileSize", "getEncodingFromOptions", "getInputStream", "Ljava/io/OutputStream;", "getOutputStream", "getNearestSAFFile", "toFile", "uriStr", "parseFileUri", "inputStream", "", "getInputStreamBytes", "Lokhttp3/Headers;", "headers", "Landroid/os/Bundle;", "translateHeaders", "Lexpo/modules/core/ModuleRegistry;", "onCreate", "getName", "getConstants", "_uriStr", "getInfoAsync", "readAsStringAsync", "string", "writeAsStringAsync", "deleteAsync", "moveAsync", "copyAsync", "makeDirectoryAsync", "readDirectoryAsync", "getTotalDiskCapacityAsync", "getFreeDiskStorageAsync", "getContentUriAsync", "readSAFDirectoryAsync", "dirName", "makeSAFDirectoryAsync", "fileName", "mimeType", "createSAFFileAsync", "initialFileUrl", "requestDirectoryPermissionsAsync", "uploadAsync", ExponentInstallationId.LEGACY_UUID_KEY, "uploadTaskStartAsync", "downloadAsync", "networkTaskCancelAsync", "fileUriStr", "resumeData", "downloadResumableStartAsync", "downloadResumablePauseAsync", "Landroid/app/Activity;", "activity", "", "requestCode", StatusResponse.RESULT_CODE, "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "intent", "onNewIntent", "Lexpo/modules/core/ModuleRegistryDelegate;", "moduleRegistryDelegate", "Lexpo/modules/core/ModuleRegistryDelegate;", "Lokhttp3/OkHttpClient;", PaymentMethodOptionsParams.WeChatPay.PARAM_CLIENT, "Lokhttp3/OkHttpClient;", "dirPermissionsRequest", "Lexpo/modules/core/Promise;", "", "Lexpo/modules/filesystem/FileSystemModule$TaskHandler;", "taskHandlers", "Ljava/util/Map;", "Lexpo/modules/core/interfaces/services/UIManager;", "uIManager$delegate", "Lvz/k;", "getUIManager", "()Lexpo/modules/core/interfaces/services/UIManager;", "uIManager", "getOkHttpClient", "()Lokhttp3/OkHttpClient;", "okHttpClient", "isSAFUri", "(Landroid/net/Uri;)Z", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;Lexpo/modules/core/ModuleRegistryDelegate;)V", "DownloadResumableTask", "DownloadResumableTaskParams", "DownloadTaskHandler", "ProgressListener", "ProgressResponseBody", "TaskHandler", "Lexpo/modules/interfaces/filesystem/FilePermissionModuleInterface;", "filePermissionModule", "Lexpo/modules/core/interfaces/ActivityProvider;", "activityProvider", "Ljava/net/CookieHandler;", "cookieHandler", "expo-file-system_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public class FileSystemModule extends ExportedModule implements ActivityEventListener {
    private OkHttpClient client;
    private Promise dirPermissionsRequest;
    private final ModuleRegistryDelegate moduleRegistryDelegate;
    private final Map<String, TaskHandler> taskHandlers;
    private final k uIManager$delegate;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ)\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0016\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0004\"\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lexpo/modules/filesystem/FileSystemModule$DownloadResumableTask;", "Landroid/os/AsyncTask;", "Lexpo/modules/filesystem/FileSystemModule$DownloadResumableTaskParams;", "Ljava/lang/Void;", "", "params", "doInBackground", "([Lexpo/modules/filesystem/FileSystemModule$DownloadResumableTaskParams;)Ljava/lang/Void;", "<init>", "(Lexpo/modules/filesystem/FileSystemModule;)V", "expo-file-system_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes5.dex */
    private final class DownloadResumableTask extends AsyncTask<DownloadResumableTaskParams, Void, Void> {
        final /* synthetic */ FileSystemModule this$0;

        public DownloadResumableTask(FileSystemModule this$0) {
            s.g(this$0, "this$0");
            this.this$0 = this$0;
        }

        @Override // android.os.AsyncTask
        public Void doInBackground(DownloadResumableTaskParams... params) {
            String str;
            s.g(params, "params");
            boolean z11 = false;
            DownloadResumableTaskParams downloadResumableTaskParams = params[0];
            Call call = downloadResumableTaskParams == null ? null : downloadResumableTaskParams.getCall();
            DownloadResumableTaskParams downloadResumableTaskParams2 = params[0];
            Promise promise = downloadResumableTaskParams2 == null ? null : downloadResumableTaskParams2.getPromise();
            DownloadResumableTaskParams downloadResumableTaskParams3 = params[0];
            File file = downloadResumableTaskParams3 == null ? null : downloadResumableTaskParams3.getFile();
            DownloadResumableTaskParams downloadResumableTaskParams4 = params[0];
            Boolean valueOf = downloadResumableTaskParams4 == null ? null : Boolean.valueOf(downloadResumableTaskParams4.isResume());
            DownloadResumableTaskParams downloadResumableTaskParams5 = params[0];
            Map<String, Object> options = downloadResumableTaskParams5 == null ? null : downloadResumableTaskParams5.getOptions();
            try {
                s.e(call);
                Response execute = FirebasePerfOkHttpClient.execute(call);
                ResponseBody body = execute.body();
                s.e(body);
                BufferedInputStream bufferedInputStream = new BufferedInputStream(body.byteStream());
                FileOutputStream fileOutputStream = new FileOutputStream(file, s.c(valueOf, Boolean.TRUE));
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = bufferedInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
                Bundle bundle = new Bundle();
                FileSystemModule fileSystemModule = this.this$0;
                bundle.putString("uri", Uri.fromFile(file).toString());
                bundle.putInt(PermissionsResponse.STATUS_KEY, execute.code());
                bundle.putBundle("headers", fileSystemModule.translateHeaders(execute.headers()));
                Object obj = options == null ? null : options.get("md5");
                if (!s.c(obj, Boolean.TRUE)) {
                    obj = null;
                }
                if (obj != null) {
                    bundle.putString("md5", file == null ? null : fileSystemModule.md5(file));
                }
                execute.close();
                if (promise != 0) {
                    promise.resolve(bundle);
                }
            } catch (Exception e11) {
                if (call != null && call.isCanceled()) {
                    z11 = true;
                }
                if (z11) {
                    if (promise != 0) {
                        promise.resolve(null);
                    }
                    return null;
                }
                String message = e11.getMessage();
                if (message != null) {
                    str = FileSystemModuleKt.TAG;
                    Log.e(str, message);
                }
                if (promise != null) {
                    promise.reject(e11);
                }
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001BC\b\u0000\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b%\u0010&R4\u0010\u0004\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0019\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u001f\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lexpo/modules/filesystem/FileSystemModule$DownloadResumableTaskParams;", "", "", "", "options", "Ljava/util/Map;", "getOptions", "()Ljava/util/Map;", "setOptions", "(Ljava/util/Map;)V", "Lokhttp3/Call;", "call", "Lokhttp3/Call;", "getCall", "()Lokhttp3/Call;", "setCall", "(Lokhttp3/Call;)V", "Ljava/io/File;", Action.FILE_ATTRIBUTE, "Ljava/io/File;", "getFile", "()Ljava/io/File;", "setFile", "(Ljava/io/File;)V", "", "isResume", "Z", "()Z", "setResume", "(Z)V", "Lexpo/modules/core/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lexpo/modules/core/Promise;", "getPromise", "()Lexpo/modules/core/Promise;", "setPromise", "(Lexpo/modules/core/Promise;)V", "<init>", "(Ljava/util/Map;Lokhttp3/Call;Ljava/io/File;ZLexpo/modules/core/Promise;)V", "expo-file-system_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes5.dex */
    public static final class DownloadResumableTaskParams {
        private Call call;
        private File file;
        private boolean isResume;
        private Map<String, ? extends Object> options;
        private Promise promise;

        public DownloadResumableTaskParams(Map<String, ? extends Object> map, Call call, File file, boolean z11, Promise promise) {
            s.g(call, "call");
            s.g(file, "file");
            s.g(promise, "promise");
            this.options = map;
            this.call = call;
            this.file = file;
            this.isResume = z11;
            this.promise = promise;
        }

        public final Call getCall() {
            return this.call;
        }

        public final File getFile() {
            return this.file;
        }

        public final Map<String, Object> getOptions() {
            return this.options;
        }

        public final Promise getPromise() {
            return this.promise;
        }

        public final boolean isResume() {
            return this.isResume;
        }

        public final void setCall(Call call) {
            s.g(call, "<set-?>");
            this.call = call;
        }

        public final void setFile(File file) {
            s.g(file, "<set-?>");
            this.file = file;
        }

        public final void setOptions(Map<String, ? extends Object> map) {
            this.options = map;
        }

        public final void setPromise(Promise promise) {
            s.g(promise, "<set-?>");
            this.promise = promise;
        }

        public final void setResume(boolean z11) {
            this.isResume = z11;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lexpo/modules/filesystem/FileSystemModule$DownloadTaskHandler;", "Lexpo/modules/filesystem/FileSystemModule$TaskHandler;", "Landroid/net/Uri;", "fileUri", "Landroid/net/Uri;", "getFileUri", "()Landroid/net/Uri;", "Lokhttp3/Call;", "call", "<init>", "(Landroid/net/Uri;Lokhttp3/Call;)V", "expo-file-system_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes5.dex */
    private static final class DownloadTaskHandler extends TaskHandler {
        private final Uri fileUri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DownloadTaskHandler(Uri fileUri, Call call) {
            super(call);
            s.g(fileUri, "fileUri");
            s.g(call, "call");
            this.fileUri = fileUri;
        }

        public final Uri getFileUri() {
            return this.fileUri;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bà\u0080\u0001\u0018\u00002\u00020\u0001J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\t"}, d2 = {"Lexpo/modules/filesystem/FileSystemModule$ProgressListener;", "", "", "bytesRead", "contentLength", "", "done", "Lvz/b0;", "update", "expo-file-system_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes5.dex */
    public interface ProgressListener {
        void update(long j11, long j12, boolean z11);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u001b\b\u0000\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\u0003\u001a\u00020\bH\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lexpo/modules/filesystem/FileSystemModule$ProgressResponseBody;", "Lokhttp3/ResponseBody;", "Lokio/e0;", Stripe3ds2AuthParams.FIELD_SOURCE, "Lokhttp3/MediaType;", CMSAttributeTableGenerator.CONTENT_TYPE, "", "contentLength", "Lokio/h;", "responseBody", "Lokhttp3/ResponseBody;", "Lexpo/modules/filesystem/FileSystemModule$ProgressListener;", "progressListener", "Lexpo/modules/filesystem/FileSystemModule$ProgressListener;", "bufferedSource", "Lokio/h;", "<init>", "(Lokhttp3/ResponseBody;Lexpo/modules/filesystem/FileSystemModule$ProgressListener;)V", "expo-file-system_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes5.dex */
    public static final class ProgressResponseBody extends ResponseBody {
        private h bufferedSource;
        private final ProgressListener progressListener;
        private final ResponseBody responseBody;

        public ProgressResponseBody(ResponseBody responseBody, ProgressListener progressListener) {
            s.g(progressListener, "progressListener");
            this.responseBody = responseBody;
            this.progressListener = progressListener;
        }

        public static final /* synthetic */ ProgressListener access$getProgressListener$p(ProgressResponseBody progressResponseBody) {
            return progressResponseBody.progressListener;
        }

        public static final /* synthetic */ ResponseBody access$getResponseBody$p(ProgressResponseBody progressResponseBody) {
            return progressResponseBody.responseBody;
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
            ResponseBody responseBody = this.responseBody;
            if (responseBody == null) {
                return -1L;
            }
            return responseBody.contentLength();
        }

        @Override // okhttp3.ResponseBody
        public MediaType contentType() {
            ResponseBody responseBody = this.responseBody;
            if (responseBody == null) {
                return null;
            }
            return responseBody.contentType();
        }

        @Override // okhttp3.ResponseBody
        public h source() {
            h hVar = this.bufferedSource;
            if (hVar == null) {
                ResponseBody responseBody = this.responseBody;
                s.e(responseBody);
                return r.d(source(responseBody.source()));
            }
            return hVar;
        }

        private final e0 source(e0 e0Var) {
            return new l(e0Var) { // from class: expo.modules.filesystem.FileSystemModule$ProgressResponseBody$source$1
                final /* synthetic */ e0 $source;
                private long totalBytesRead;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(e0Var);
                    this.$source = e0Var;
                }

                public final long getTotalBytesRead() {
                    return this.totalBytesRead;
                }

                @Override // okio.l, okio.e0
                public long read(f sink, long j11) {
                    s.g(sink, "sink");
                    long read = super.read(sink, j11);
                    int i11 = (read > (-1L) ? 1 : (read == (-1L) ? 0 : -1));
                    this.totalBytesRead += i11 != 0 ? read : 0L;
                    FileSystemModule.ProgressListener access$getProgressListener$p = FileSystemModule.ProgressResponseBody.access$getProgressListener$p(FileSystemModule.ProgressResponseBody.this);
                    long j12 = this.totalBytesRead;
                    ResponseBody access$getResponseBody$p = FileSystemModule.ProgressResponseBody.access$getResponseBody$p(FileSystemModule.ProgressResponseBody.this);
                    access$getProgressListener$p.update(j12, access$getResponseBody$p != null ? access$getResponseBody$p.contentLength() : -1L, i11 == 0);
                    return read;
                }

                public final void setTotalBytesRead(long j11) {
                    this.totalBytesRead = j11;
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0012\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lexpo/modules/filesystem/FileSystemModule$TaskHandler;", "", "Lokhttp3/Call;", "call", "Lokhttp3/Call;", "getCall", "()Lokhttp3/Call;", "<init>", "(Lokhttp3/Call;)V", "expo-file-system_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes5.dex */
    public static class TaskHandler {
        private final Call call;

        public TaskHandler(Call call) {
            s.g(call, "call");
            this.call = call;
        }

        public final Call getCall() {
            return this.call;
        }
    }

    public /* synthetic */ FileSystemModule(Context context, ModuleRegistryDelegate moduleRegistryDelegate, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? new ModuleRegistryDelegate() : moduleRegistryDelegate);
    }

    /* renamed from: _get_okHttpClient_$lambda-59 */
    private static final CookieHandler m597_get_okHttpClient_$lambda59(k<? extends CookieHandler> kVar) {
        CookieHandler value = kVar.getValue();
        s.f(value, "_get_okHttpClient_$lambda-59(...)");
        return value;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InlineMethods
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to process method for inline: expo.modules.filesystem.FileSystemModule.uploadAsync$lambda-42(okhttp3.RequestBody):okhttp3.RequestBody
        	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:76)
        	at jadx.core.dex.visitors.InlineMethods.visit(InlineMethods.java:51)
        Caused by: java.lang.NullPointerException
        */
    public static /* synthetic */ okhttp3.RequestBody a(okhttp3.RequestBody r0) {
        /*
            okhttp3.RequestBody r0 = m601uploadAsync$lambda42(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: expo.modules.filesystem.FileSystemModule.a(okhttp3.RequestBody):okhttp3.RequestBody");
    }

    public static final /* synthetic */ ModuleRegistryDelegate access$getModuleRegistryDelegate$p(FileSystemModule fileSystemModule) {
        return fileSystemModule.moduleRegistryDelegate;
    }

    public static final /* synthetic */ String access$md5(FileSystemModule fileSystemModule, File file) {
        return fileSystemModule.md5(file);
    }

    public static final /* synthetic */ File access$toFile(FileSystemModule fileSystemModule, Uri uri) {
        return fileSystemModule.toFile(uri);
    }

    public static final /* synthetic */ Bundle access$translateHeaders(FileSystemModule fileSystemModule, Headers headers) {
        return fileSystemModule.translateHeaders(headers);
    }

    private final void checkIfFileDirExists(Uri uri) {
        File file = toFile(uri);
        File parentFile = file.getParentFile();
        if (parentFile == null || !parentFile.exists()) {
            String path = file.getPath();
            String parent = file.getParent();
            throw new IOException("Directory for '" + path + "' doesn't exist. Please make sure directory '" + parent + "' exists before calling downloadAsync.");
        }
    }

    private final void checkIfFileExists(Uri uri) {
        File file = toFile(uri);
        if (file.exists()) {
            return;
        }
        String path = file.getPath();
        throw new IOException("Directory for '" + path + "' doesn't exist.");
    }

    private final Uri contentUriFromFile(File file) {
        k a11;
        a11 = m.a(new FileSystemModule$contentUriFromFile$$inlined$moduleRegistry$1(this.moduleRegistryDelegate));
        Application application = m598contentUriFromFile$lambda27(a11).getCurrentActivity().getApplication();
        String packageName = application.getPackageName();
        Uri uriForFile = FileProvider.getUriForFile(application, packageName + ".FileSystemFileProvider", file);
        s.f(uriForFile, "getUriForFile(applicatio…ystemFileProvider\", file)");
        return uriForFile;
    }

    /* renamed from: contentUriFromFile$lambda-27 */
    private static final ActivityProvider m598contentUriFromFile$lambda27(k<? extends ActivityProvider> kVar) {
        ActivityProvider value = kVar.getValue();
        s.f(value, "contentUriFromFile$lambda-27(...)");
        return value;
    }

    private final RequestBody createRequestBody(Map<String, ? extends Object> map, RequestBodyDecorator requestBodyDecorator, File file) {
        UploadType.Companion companion = UploadType.Companion;
        Object obj = map.get("uploadType");
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Double");
        UploadType fromInt = companion.fromInt((int) ((Double) obj).doubleValue());
        if (fromInt == UploadType.BINARY_CONTENT) {
            return requestBodyDecorator.decorate(RequestBody.Companion.create((MediaType) null, file));
        }
        if (fromInt == UploadType.MULTIPART) {
            MultipartBody.Builder type = new MultipartBody.Builder(null, 1, null).setType(MultipartBody.FORM);
            Object obj2 = map.get("parameters");
            if (obj2 != null) {
                for (Map.Entry entry : ((Map) obj2).entrySet()) {
                    type.addFormDataPart((String) entry.getKey(), entry.getValue().toString());
                }
            }
            Object obj3 = map.get("mimeType");
            String str = obj3 == null ? null : (String) obj3;
            if (str == null) {
                str = URLConnection.guessContentTypeFromName(file.getName());
                s.f(str, "guessContentTypeFromName(file.name)");
            }
            Object obj4 = map.get("fieldName");
            String fieldName = obj4 != null ? (String) obj4 : null;
            if (fieldName == null) {
                fieldName = file.getName();
            }
            s.f(fieldName, "fieldName");
            type.addFormDataPart(fieldName, file.getName(), requestBodyDecorator.decorate(RequestBody.Companion.create(file, MediaType.Companion.parse(str))));
            return type.build();
        }
        q0 q0Var = q0.f34921a;
        String format = String.format("Invalid upload type: %s.", Arrays.copyOf(new Object[]{map.get("uploadType")}, 1));
        s.f(format, "format(format, *args)");
        throw new IllegalArgumentException("ERR_FILESYSTEM_INVALID_UPLOAD_TYPE. " + format);
    }

    private final Request createUploadRequest(String str, String str2, Map<String, ? extends Object> map, Promise promise, RequestBodyDecorator requestBodyDecorator) {
        String str3;
        String slashifyFilePath;
        Map map2;
        try {
            slashifyFilePath = FileSystemModuleKt.slashifyFilePath(str2);
            Uri fileUri = Uri.parse(slashifyFilePath);
            s.f(fileUri, "fileUri");
            ensurePermission(fileUri, Permission.READ);
            checkIfFileExists(fileUri);
            if (!map.containsKey("httpMethod")) {
                promise.reject("ERR_FILESYSTEM_MISSING_HTTP_METHOD", "Missing HTTP method.", null);
                return null;
            }
            String str4 = (String) map.get("httpMethod");
            if (!map.containsKey("uploadType")) {
                promise.reject("ERR_FILESYSTEM_MISSING_UPLOAD_TYPE", "Missing upload type.", null);
                return null;
            }
            Request.Builder url = new Request.Builder().url(str);
            if (map.containsKey("headers") && (map2 = (Map) map.get("headers")) != null) {
                for (Map.Entry entry : map2.entrySet()) {
                    url.addHeader((String) entry.getKey(), entry.getValue().toString());
                }
            }
            RequestBody createRequestBody = createRequestBody(map, requestBodyDecorator, toFile(fileUri));
            if (str4 == null) {
                return null;
            }
            return url.method(str4, createRequestBody).build();
        } catch (Exception e11) {
            String message = e11.getMessage();
            if (message != null) {
                str3 = FileSystemModuleKt.TAG;
                Log.e(str3, message);
            }
            promise.reject(e11);
            return null;
        }
    }

    private final void ensureDirExists(File file) {
        if (file.isDirectory() || file.mkdirs()) {
            return;
        }
        throw new IOException("Couldn't create directory '" + file + "'");
    }

    private final void ensurePermission(Uri uri, Permission permission, String str) {
        EnumSet<Permission> permissionsForUri = permissionsForUri(uri);
        boolean z11 = false;
        if (permissionsForUri != null && permissionsForUri.contains(permission)) {
            z11 = true;
        }
        if (!z11) {
            throw new IOException(str);
        }
    }

    private final void forceDelete(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                IOException e11 = null;
                int i11 = 0;
                int length = listFiles.length;
                while (i11 < length) {
                    File f11 = listFiles[i11];
                    i11++;
                    try {
                        s.f(f11, "f");
                        forceDelete(f11);
                    } catch (IOException e12) {
                        e11 = e12;
                    }
                }
                if (e11 == null) {
                    if (file.delete()) {
                        return;
                    }
                    throw new IOException("Unable to delete directory " + file + ".");
                }
                throw e11;
            }
            throw new IOException("Failed to list contents of " + file);
        } else if (file.delete()) {
        } else {
            throw new IOException("Unable to delete file: " + file);
        }
    }

    private final String getEncodingFromOptions(Map<String, ? extends Object> map) {
        if (map.containsKey("encoding") && (map.get("encoding") instanceof String)) {
            Object obj = map.get("encoding");
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
            Locale ROOT = Locale.ROOT;
            s.f(ROOT, "ROOT");
            String lowerCase = ((String) obj).toLowerCase(ROOT);
            s.f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            return lowerCase;
        }
        return "utf8";
    }

    private final long getFileSize(File file) {
        Object obj;
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return 0L;
        }
        ArrayList arrayList = new ArrayList(listFiles.length);
        int i11 = 0;
        int length = listFiles.length;
        while (i11 < length) {
            File it2 = listFiles[i11];
            i11++;
            s.f(it2, "it");
            arrayList.add(Long.valueOf(getFileSize(it2)));
        }
        Iterator it3 = arrayList.iterator();
        if (it3.hasNext()) {
            Object next = it3.next();
            while (it3.hasNext()) {
                next = Long.valueOf(((Number) next).longValue() + ((Number) it3.next()).longValue());
            }
            obj = next;
        } else {
            obj = null;
        }
        Long l11 = (Long) obj;
        if (l11 == null) {
            return 0L;
        }
        return l11.longValue();
    }

    private final InputStream getInputStream(Uri uri) {
        if (s.c(uri.getScheme(), Action.FILE_ATTRIBUTE)) {
            return new FileInputStream(toFile(uri));
        }
        if (s.c(uri.getScheme(), "asset")) {
            return openAssetInputStream(uri);
        }
        if (isSAFUri(uri)) {
            InputStream openInputStream = getContext().getContentResolver().openInputStream(uri);
            s.e(openInputStream);
            s.f(openInputStream, "context.contentResolver.openInputStream(uri)!!");
            return openInputStream;
        }
        throw new IOException("Unsupported scheme for location '" + uri + "'.");
    }

    private final byte[] getInputStreamBytes(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } finally {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException unused) {
                }
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        s.f(byteArray, "byteBuffer.toByteArray()");
        return byteArray;
    }

    private final c4.a getNearestSAFFile(Uri uri) {
        c4.a g11 = c4.a.g(getContext(), uri);
        return (g11 == null || !g11.l()) ? c4.a.h(getContext(), uri) : g11;
    }

    private final synchronized OkHttpClient getOkHttpClient() {
        k a11;
        if (this.client == null) {
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            OkHttpClient.Builder writeTimeout = builder.connectTimeout(60L, timeUnit).readTimeout(60L, timeUnit).writeTimeout(60L, timeUnit);
            a11 = m.a(new FileSystemModule$special$$inlined$moduleRegistry$2(this.moduleRegistryDelegate));
            writeTimeout.cookieJar(new JavaNetCookieJar(m597_get_okHttpClient_$lambda59(a11)));
            this.client = writeTimeout.build();
        }
        return this.client;
    }

    private final OutputStream getOutputStream(Uri uri) {
        OutputStream openOutputStream;
        if (s.c(uri.getScheme(), Action.FILE_ATTRIBUTE)) {
            openOutputStream = new FileOutputStream(toFile(uri));
        } else if (!isSAFUri(uri)) {
            throw new IOException("Unsupported scheme for location '" + uri + "'.");
        } else {
            openOutputStream = getContext().getContentResolver().openOutputStream(uri);
            s.e(openOutputStream);
        }
        s.f(openOutputStream, "when {\n    uri.scheme ==…or location '$uri'.\")\n  }");
        return openOutputStream;
    }

    private final UIManager getUIManager() {
        Object value = this.uIManager$delegate.getValue();
        s.f(value, "<get-uIManager>(...)");
        return (UIManager) value;
    }

    private final boolean isSAFUri(Uri uri) {
        if (s.c(uri.getScheme(), "content")) {
            String host = uri.getHost();
            return host == null ? false : v.H(host, "com.android.externalstorage", false, 2, null);
        }
        return false;
    }

    public final String md5(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            char[] a11 = s30.a.a(t30.a.d(fileInputStream));
            s.f(a11, "encodeHex(md5bytes)");
            String str = new String(a11);
            b.a(fileInputStream, null);
            return str;
        } finally {
        }
    }

    private final /* synthetic */ <T> k<T> moduleRegistry() {
        k<T> a11;
        ModuleRegistryDelegate moduleRegistryDelegate = this.moduleRegistryDelegate;
        s.l();
        a11 = m.a(new FileSystemModule$moduleRegistry$$inlined$getFromModuleRegistry$1(moduleRegistryDelegate));
        return a11;
    }

    private final InputStream openAssetInputStream(Uri uri) {
        String path = uri.getPath();
        if (path != null) {
            String substring = path.substring(1);
            s.f(substring, "this as java.lang.String).substring(startIndex)");
            InputStream open = getContext().getAssets().open(substring);
            s.f(open, "context.assets.open(asset)");
            return open;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    private final InputStream openResourceInputStream(String str) {
        int identifier = getContext().getResources().getIdentifier(str, "raw", getContext().getPackageName());
        if (identifier == 0 && (identifier = getContext().getResources().getIdentifier(str, "drawable", getContext().getPackageName())) == 0) {
            throw new FileNotFoundException("No resource found with the name '" + str + "'");
        }
        InputStream openRawResource = getContext().getResources().openRawResource(identifier);
        s.f(openRawResource, "context.resources.openRawResource(resourceId)");
        return openRawResource;
    }

    private final String parseFileUri(String str) {
        int Y;
        Y = w.Y(str, CoreConstants.COLON_CHAR, 0, false, 6, null);
        String substring = str.substring(Y + 3);
        s.f(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    private final EnumSet<Permission> permissionsForPath(String str) {
        k a11;
        a11 = m.a(new FileSystemModule$permissionsForPath$$inlined$moduleRegistry$1(this.moduleRegistryDelegate));
        return m599permissionsForPath$lambda0(a11).getPathPermissions(getContext(), str);
    }

    /* renamed from: permissionsForPath$lambda-0 */
    private static final FilePermissionModuleInterface m599permissionsForPath$lambda0(k<? extends FilePermissionModuleInterface> kVar) {
        FilePermissionModuleInterface value = kVar.getValue();
        s.f(value, "permissionsForPath$lambda-0(...)");
        return value;
    }

    private final EnumSet<Permission> permissionsForSAFUri(Uri uri) {
        c4.a nearestSAFFile = getNearestSAFFile(uri);
        EnumSet<Permission> noneOf = EnumSet.noneOf(Permission.class);
        if (nearestSAFFile != null) {
            if (nearestSAFFile.a()) {
                noneOf.add(Permission.READ);
            }
            if (nearestSAFFile.b()) {
                noneOf.add(Permission.WRITE);
            }
        }
        s.f(noneOf, "noneOf(Permission::class…)\n        }\n      }\n    }");
        return noneOf;
    }

    private final EnumSet<Permission> permissionsForUri(Uri uri) {
        if (isSAFUri(uri)) {
            return permissionsForSAFUri(uri);
        }
        if (!s.c(uri.getScheme(), "content") && !s.c(uri.getScheme(), "asset")) {
            return s.c(uri.getScheme(), Action.FILE_ATTRIBUTE) ? permissionsForPath(uri.getPath()) : uri.getScheme() == null ? EnumSet.of(Permission.READ) : EnumSet.noneOf(Permission.class);
        }
        return EnumSet.of(Permission.READ);
    }

    /* renamed from: requestDirectoryPermissionsAsync$lambda-33 */
    private static final ActivityProvider m600requestDirectoryPermissionsAsync$lambda33(k<? extends ActivityProvider> kVar) {
        ActivityProvider value = kVar.getValue();
        s.f(value, "requestDirectoryPermissionsAsync$lambda-33(...)");
        return value;
    }

    public final File toFile(Uri uri) {
        return new File(uri.getPath());
    }

    private final void transformFilesFromSAF(c4.a aVar, File file, boolean z11) {
        if (aVar.f()) {
            if (!file.exists() && !file.mkdirs()) {
                throw new IOException("Couldn't create folder in output dir.");
            }
            if (aVar.k()) {
                c4.a[] m11 = aVar.m();
                s.f(m11, "documentFile.listFiles()");
                int i11 = 0;
                int length = m11.length;
                while (i11 < length) {
                    c4.a file2 = m11[i11];
                    i11++;
                    String i12 = aVar.i();
                    if (i12 != null) {
                        s.f(file2, "file");
                        transformFilesFromSAF(file2, new File(file, i12), z11);
                    }
                }
                if (z11) {
                    return;
                }
                aVar.e();
                return;
            }
            String i13 = aVar.i();
            if (i13 == null) {
                return;
            }
            File file3 = new File(file.getPath(), i13);
            InputStream openInputStream = getContext().getContentResolver().openInputStream(aVar.j());
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file3);
                d.a(openInputStream, fileOutputStream);
                b.a(fileOutputStream, null);
                b.a(openInputStream, null);
                if (z11) {
                    return;
                }
                aVar.e();
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    b.a(openInputStream, th2);
                    throw th3;
                }
            }
        }
    }

    public final Bundle translateHeaders(Headers headers) {
        Bundle bundle = new Bundle();
        int size = headers.size();
        if (size > 0) {
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                String name = headers.name(i11);
                if (bundle.get(name) != null) {
                    String string = bundle.getString(name);
                    String value = headers.value(i11);
                    bundle.putString(name, string + ", " + value);
                } else {
                    bundle.putString(name, headers.value(i11));
                }
                if (i12 >= size) {
                    break;
                }
                i11 = i12;
            }
        }
        return bundle;
    }

    /*  JADX ERROR: NullPointerException in pass: MarkMethodsForInline
        java.lang.NullPointerException
        */
    /* renamed from: uploadAsync$lambda-42 */
    private static final okhttp3.RequestBody m601uploadAsync$lambda42(okhttp3.RequestBody r1) {
        /*
            java.lang.String r0 = "requestBody"
            kotlin.jvm.internal.s.g(r1, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: expo.modules.filesystem.FileSystemModule.m601uploadAsync$lambda42(okhttp3.RequestBody):okhttp3.RequestBody");
    }

    @ExpoMethod
    public final void copyAsync(Map<String, ? extends Object> options, Promise promise) {
        String str;
        String slashifyFilePath;
        String slashifyFilePath2;
        s.g(options, "options");
        s.g(promise, "promise");
        try {
            if (options.containsKey("from")) {
                slashifyFilePath = FileSystemModuleKt.slashifyFilePath((String) options.get("from"));
                Uri fromUri = Uri.parse(slashifyFilePath);
                s.f(fromUri, "fromUri");
                ensurePermission(fromUri, Permission.READ);
                if (options.containsKey("to")) {
                    slashifyFilePath2 = FileSystemModuleKt.slashifyFilePath((String) options.get("to"));
                    Uri toUri = Uri.parse(slashifyFilePath2);
                    s.f(toUri, "toUri");
                    ensurePermission(toUri, Permission.WRITE);
                    if (s.c(fromUri.getScheme(), Action.FILE_ATTRIBUTE)) {
                        File file = toFile(fromUri);
                        File file2 = toFile(toUri);
                        if (file.isDirectory()) {
                            u30.b.c(file, file2);
                        } else {
                            u30.b.f(file, file2);
                        }
                        promise.resolve(null);
                        return;
                    } else if (isSAFUri(fromUri)) {
                        c4.a nearestSAFFile = getNearestSAFFile(fromUri);
                        if (nearestSAFFile != null && nearestSAFFile.f()) {
                            transformFilesFromSAF(nearestSAFFile, new File(toUri.getPath()), true);
                            promise.resolve(null);
                            return;
                        }
                        promise.reject("ERR_FILESYSTEM_CANNOT_FIND_FILE", "File '" + fromUri + "' could not be copied because it could not be found");
                        return;
                    } else if (s.c(fromUri.getScheme(), "content")) {
                        d.a(getContext().getContentResolver().openInputStream(fromUri), new FileOutputStream(toFile(toUri)));
                        promise.resolve(null);
                        return;
                    } else if (s.c(fromUri.getScheme(), "asset")) {
                        d.a(openAssetInputStream(fromUri), new FileOutputStream(toFile(toUri)));
                        promise.resolve(null);
                        return;
                    } else if (fromUri.getScheme() == null) {
                        d.a(openResourceInputStream((String) options.get("from")), new FileOutputStream(toFile(toUri)));
                        promise.resolve(null);
                        return;
                    } else {
                        throw new IOException("Unsupported scheme for location '" + fromUri + "'.");
                    }
                }
                promise.reject("ERR_FILESYSTEM_MISSING_PARAMETER", "`FileSystem.moveAsync` needs a `to` path.");
                return;
            }
            promise.reject("ERR_FILESYSTEM_MISSING_PARAMETER", "`FileSystem.moveAsync` needs a `from` path.");
        } catch (Exception e11) {
            String message = e11.getMessage();
            if (message != null) {
                str = FileSystemModuleKt.TAG;
                Log.e(str, message);
            }
            promise.reject(e11);
        }
    }

    @ExpoMethod
    public final void createSAFFileAsync(String str, String str2, String str3, Promise promise) {
        String slashifyFilePath;
        s.g(promise, "promise");
        try {
            slashifyFilePath = FileSystemModuleKt.slashifyFilePath(str);
            Uri uri = Uri.parse(slashifyFilePath);
            s.f(uri, "uri");
            ensurePermission(uri, Permission.WRITE);
            if (isSAFUri(uri)) {
                c4.a nearestSAFFile = getNearestSAFFile(uri);
                if (nearestSAFFile != null && nearestSAFFile.k()) {
                    if (str3 != null && str2 != null) {
                        c4.a d11 = nearestSAFFile.d(str3, str2);
                        if (d11 == null) {
                            promise.reject("ERR_FILESYSTEM_CANNOT_CREATE_FILE", "Unknown error.");
                            return;
                        } else {
                            promise.resolve(d11.j().toString());
                            return;
                        }
                    }
                    promise.reject("ERR_FILESYSTEM_CANNOT_CREATE_FILE", "Parameters fileName and mimeType can not be null.");
                    return;
                }
                promise.reject("ERR_FILESYSTEM_CANNOT_CREATE_FILE", "Provided uri '" + uri + "' is not pointing to a directory.");
                return;
            }
            throw new IOException("The URI '" + uri + "' is not a Storage Access Framework URI.");
        } catch (Exception e11) {
            promise.reject(e11);
        }
    }

    @ExpoMethod
    public final void deleteAsync(String str, Map<String, ? extends Object> options, Promise promise) {
        String str2;
        String slashifyFilePath;
        s.g(options, "options");
        s.g(promise, "promise");
        try {
            slashifyFilePath = FileSystemModuleKt.slashifyFilePath(str);
            Uri uri = Uri.parse(slashifyFilePath);
            Uri appendedUri = Uri.withAppendedPath(uri, CallerDataConverter.DEFAULT_RANGE_DELIMITER);
            s.f(appendedUri, "appendedUri");
            Permission permission = Permission.WRITE;
            ensurePermission(appendedUri, permission, "Location '" + uri + "' isn't deletable.");
            if (s.c(uri.getScheme(), Action.FILE_ATTRIBUTE)) {
                s.f(uri, "uri");
                File file = toFile(uri);
                if (file.exists()) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        u30.b.k(file);
                    } else {
                        forceDelete(file);
                    }
                    promise.resolve(null);
                    return;
                }
                if (options.containsKey("idempotent")) {
                    Object obj = options.get("idempotent");
                    if (obj == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                    }
                    if (((Boolean) obj).booleanValue()) {
                        promise.resolve(null);
                        return;
                    }
                }
                promise.reject("ERR_FILESYSTEM_CANNOT_FIND_FILE", "File '" + uri + "' could not be deleted because it could not be found");
                return;
            }
            s.f(uri, "uri");
            if (isSAFUri(uri)) {
                c4.a nearestSAFFile = getNearestSAFFile(uri);
                if (nearestSAFFile != null && nearestSAFFile.f()) {
                    nearestSAFFile.e();
                    promise.resolve(null);
                    return;
                }
                if (options.containsKey("idempotent")) {
                    Object obj2 = options.get("idempotent");
                    if (obj2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                    }
                    if (((Boolean) obj2).booleanValue()) {
                        promise.resolve(null);
                        return;
                    }
                }
                promise.reject("ERR_FILESYSTEM_CANNOT_FIND_FILE", "File '" + uri + "' could not be deleted because it could not be found");
                return;
            }
            throw new IOException("Unsupported scheme for location '" + uri + "'.");
        } catch (Exception e11) {
            String message = e11.getMessage();
            if (message != null) {
                str2 = FileSystemModuleKt.TAG;
                Log.e(str2, message);
            }
            promise.reject(e11);
        }
    }

    @ExpoMethod
    public final void downloadAsync(String url, String str, final Map<String, ? extends Object> map, final Promise promise) {
        String str2;
        String slashifyFilePath;
        boolean M;
        Call newCall;
        c0 g11;
        s.g(url, "url");
        s.g(promise, "promise");
        try {
            slashifyFilePath = FileSystemModuleKt.slashifyFilePath(str);
            final Uri uri = Uri.parse(slashifyFilePath);
            s.f(uri, "uri");
            ensurePermission(uri, Permission.WRITE);
            checkIfFileDirExists(uri);
            M = w.M(url, ":", false, 2, null);
            if (!M) {
                Context context = getContext();
                InputStream openRawResource = context.getResources().openRawResource(context.getResources().getIdentifier(url, "raw", context.getPackageName()));
                s.f(openRawResource, "context.resources.openRawResource(resourceId)");
                h d11 = r.d(r.k(openRawResource));
                File file = toFile(uri);
                file.delete();
                g11 = okio.s.g(file, false, 1, null);
                g c11 = r.c(g11);
                c11.b0(d11);
                c11.close();
                Bundle bundle = new Bundle();
                bundle.putString("uri", Uri.fromFile(file).toString());
                Object obj = map == null ? null : map.get("md5");
                if ((s.c(obj, Boolean.TRUE) ? obj : null) != null) {
                    bundle.putString("md5", md5(file));
                }
                promise.resolve(bundle);
            } else if (s.c(Action.FILE_ATTRIBUTE, uri.getScheme())) {
                Request.Builder url2 = new Request.Builder().url(url);
                if (map != null && map.containsKey("headers")) {
                    try {
                        Map map2 = (Map) map.get("headers");
                        if (map2 != null) {
                            for (Map.Entry entry : map2.entrySet()) {
                                url2.addHeader((String) entry.getKey(), entry.getValue().toString());
                            }
                        }
                    } catch (ClassCastException e11) {
                        promise.reject("ERR_FILESYSTEM_INVALID_HEADERS", "Invalid headers dictionary. Keys and values should be strings.", e11);
                        return;
                    }
                }
                OkHttpClient okHttpClient = getOkHttpClient();
                if (okHttpClient != null && (newCall = okHttpClient.newCall(url2.build())) != null) {
                    FirebasePerfOkHttpClient.enqueue(newCall, new Callback() { // from class: expo.modules.filesystem.FileSystemModule$downloadAsync$4
                        @Override // okhttp3.Callback
                        public void onFailure(Call call, IOException e12) {
                            String str3;
                            s.g(call, "call");
                            s.g(e12, "e");
                            str3 = FileSystemModuleKt.TAG;
                            Log.e(str3, String.valueOf(e12.getMessage()));
                            Promise.this.reject(e12);
                        }

                        @Override // okhttp3.Callback
                        public void onResponse(Call call, Response response) {
                            c0 g12;
                            s.g(call, "call");
                            s.g(response, "response");
                            FileSystemModule fileSystemModule = this;
                            Uri uri2 = uri;
                            s.f(uri2, "uri");
                            File access$toFile = FileSystemModule.access$toFile(fileSystemModule, uri2);
                            access$toFile.delete();
                            g12 = okio.s.g(access$toFile, false, 1, null);
                            g c12 = r.c(g12);
                            ResponseBody body = response.body();
                            s.e(body);
                            c12.b0(body.source());
                            c12.close();
                            Bundle bundle2 = new Bundle();
                            FileSystemModule fileSystemModule2 = this;
                            Map<String, Object> map3 = map;
                            bundle2.putString("uri", Uri.fromFile(access$toFile).toString());
                            bundle2.putInt(PermissionsResponse.STATUS_KEY, response.code());
                            bundle2.putBundle("headers", FileSystemModule.access$translateHeaders(fileSystemModule2, response.headers()));
                            if (map3 != null ? s.c(map3.get("md5"), Boolean.TRUE) : false) {
                                bundle2.putString("md5", FileSystemModule.access$md5(fileSystemModule2, access$toFile));
                            }
                            response.close();
                            Promise.this.resolve(bundle2);
                        }
                    });
                    r5 = b0.f54756a;
                }
                if (r5 == null) {
                    promise.reject(new NullPointerException("okHttpClient is null"));
                }
            } else {
                throw new IOException("Unsupported scheme for location '" + uri + "'.");
            }
        } catch (Exception e12) {
            String message = e12.getMessage();
            if (message != null) {
                str2 = FileSystemModuleKt.TAG;
                Log.e(str2, message);
            }
            promise.reject(e12);
        }
    }

    @ExpoMethod
    public final void downloadResumablePauseAsync(String uuid, Promise promise) {
        String str;
        String str2;
        s.g(uuid, "uuid");
        s.g(promise, "promise");
        TaskHandler taskHandler = this.taskHandlers.get(uuid);
        if (taskHandler == null) {
            IOException iOException = new IOException("No download object available");
            String message = iOException.getMessage();
            if (message != null) {
                str2 = FileSystemModuleKt.TAG;
                Log.e(str2, message);
            }
            promise.reject(iOException);
        } else if (!(taskHandler instanceof DownloadTaskHandler)) {
            promise.reject("ERR_FILESYSTEM_CANNOT_FIND_TASK", "Cannot find task.");
        } else {
            ((DownloadTaskHandler) taskHandler).getCall().cancel();
            this.taskHandlers.remove(uuid);
            try {
                File file = toFile(((DownloadTaskHandler) taskHandler).getFileUri());
                Bundle bundle = new Bundle();
                bundle.putString("resumeData", String.valueOf(file.length()));
                promise.resolve(bundle);
            } catch (Exception e11) {
                String message2 = e11.getMessage();
                if (message2 != null) {
                    str = FileSystemModuleKt.TAG;
                    Log.e(str, message2);
                }
                promise.reject(e11);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0068, code lost:
        r19.reject(new java.lang.NullPointerException("okHttpClient is null"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0072, code lost:
        return;
     */
    @expo.modules.core.interfaces.ExpoMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void downloadResumableStartAsync(java.lang.String r14, java.lang.String r15, final java.lang.String r16, java.util.Map<java.lang.String, ? extends java.lang.Object> r17, final java.lang.String r18, expo.modules.core.Promise r19) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: expo.modules.filesystem.FileSystemModule.downloadResumableStartAsync(java.lang.String, java.lang.String, java.lang.String, java.util.Map, java.lang.String, expo.modules.core.Promise):void");
    }

    @Override // expo.modules.core.ExportedModule
    public Map<String, Object> getConstants() {
        Map<String, Object> l11;
        String uri = Uri.fromFile(getContext().getFilesDir()).toString();
        String uri2 = Uri.fromFile(getContext().getCacheDir()).toString();
        l11 = s0.l(vz.v.a("documentDirectory", uri + "/"), vz.v.a("cacheDirectory", uri2 + "/"), vz.v.a("bundleDirectory", "asset:///"));
        return l11;
    }

    @ExpoMethod
    public final void getContentUriAsync(String uri, Promise promise) {
        String str;
        String slashifyFilePath;
        s.g(uri, "uri");
        s.g(promise, "promise");
        try {
            slashifyFilePath = FileSystemModuleKt.slashifyFilePath(uri);
            Uri fileUri = Uri.parse(slashifyFilePath);
            s.f(fileUri, "fileUri");
            ensurePermission(fileUri, Permission.WRITE);
            ensurePermission(fileUri, Permission.READ);
            checkIfFileDirExists(fileUri);
            if (s.c(fileUri.getScheme(), Action.FILE_ATTRIBUTE)) {
                promise.resolve(contentUriFromFile(toFile(fileUri)).toString());
            } else {
                promise.reject("ERR_FILESYSTEM_CANNOT_READ_DIRECTORY", "No readable files with the uri '" + uri + "'. Please use other uri.");
            }
        } catch (Exception e11) {
            String message = e11.getMessage();
            if (message != null) {
                str = FileSystemModuleKt.TAG;
                Log.e(str, message);
            }
            promise.reject(e11);
        }
    }

    @ExpoMethod
    public final void getFreeDiskStorageAsync(Promise promise) {
        String str;
        s.g(promise, "promise");
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
            promise.resolve(Double.valueOf(Math.min(BigInteger.valueOf(statFs.getAvailableBlocksLong()).multiply(BigInteger.valueOf(statFs.getBlockSizeLong())).doubleValue(), Math.pow(2.0d, 53.0d) - 1)));
        } catch (Exception e11) {
            String message = e11.getMessage();
            if (message != null) {
                str = FileSystemModuleKt.TAG;
                Log.e(str, message);
            }
            promise.reject("ERR_FILESYSTEM_CANNOT_DETERMINE_DISK_CAPACITY", "Unable to determine free disk storage capacity", e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0148 A[Catch: FileNotFoundException -> 0x0196, Exception -> 0x01a8, TryCatch #1 {FileNotFoundException -> 0x0196, blocks: (B:108:0x010a, B:110:0x0110, B:115:0x011f, B:118:0x0126, B:125:0x0148, B:127:0x0169, B:129:0x0175, B:130:0x018a, B:131:0x0190, B:132:0x0195, B:119:0x0133, B:122:0x013a, B:123:0x0142), top: B:143:0x010a, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0190 A[Catch: FileNotFoundException -> 0x0196, Exception -> 0x01a8, TryCatch #1 {FileNotFoundException -> 0x0196, blocks: (B:108:0x010a, B:110:0x0110, B:115:0x011f, B:118:0x0126, B:125:0x0148, B:127:0x0169, B:129:0x0175, B:130:0x018a, B:131:0x0190, B:132:0x0195, B:119:0x0133, B:122:0x013a, B:123:0x0142), top: B:143:0x010a, outer: #0 }] */
    @expo.modules.core.interfaces.ExpoMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void getInfoAsync(java.lang.String r17, java.util.Map<java.lang.String, ? extends java.lang.Object> r18, expo.modules.core.Promise r19) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: expo.modules.filesystem.FileSystemModule.getInfoAsync(java.lang.String, java.util.Map, expo.modules.core.Promise):void");
    }

    @Override // expo.modules.core.ExportedModule
    public String getName() {
        return "ExponentFileSystem";
    }

    @ExpoMethod
    public final void getTotalDiskCapacityAsync(Promise promise) {
        String str;
        s.g(promise, "promise");
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
            promise.resolve(Double.valueOf(Math.min(BigInteger.valueOf(statFs.getBlockCountLong()).multiply(BigInteger.valueOf(statFs.getBlockSizeLong())).doubleValue(), Math.pow(2.0d, 53.0d) - 1)));
        } catch (Exception e11) {
            String message = e11.getMessage();
            if (message != null) {
                str = FileSystemModuleKt.TAG;
                Log.e(str, message);
            }
            promise.reject("ERR_FILESYSTEM_CANNOT_DETERMINE_DISK_CAPACITY", "Unable to access total disk capacity", e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0053 A[Catch: Exception -> 0x00a0, TryCatch #0 {Exception -> 0x00a0, blocks: (B:39:0x000c, B:41:0x002a, B:43:0x0038, B:45:0x003e, B:52:0x0053, B:58:0x0063, B:59:0x007f, B:53:0x0058, B:48:0x0048, B:49:0x004f, B:60:0x0084, B:61:0x009f), top: B:69:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0058 A[Catch: Exception -> 0x00a0, TryCatch #0 {Exception -> 0x00a0, blocks: (B:39:0x000c, B:41:0x002a, B:43:0x0038, B:45:0x003e, B:52:0x0053, B:58:0x0063, B:59:0x007f, B:53:0x0058, B:48:0x0048, B:49:0x004f, B:60:0x0084, B:61:0x009f), top: B:69:0x000c }] */
    @expo.modules.core.interfaces.ExpoMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void makeDirectoryAsync(java.lang.String r5, java.util.Map<java.lang.String, ? extends java.lang.Object> r6, expo.modules.core.Promise r7) {
        /*
            r4 = this;
            java.lang.String r0 = "intermediates"
            java.lang.String r1 = "options"
            kotlin.jvm.internal.s.g(r6, r1)
            java.lang.String r1 = "promise"
            kotlin.jvm.internal.s.g(r7, r1)
            java.lang.String r5 = expo.modules.filesystem.FileSystemModuleKt.access$slashifyFilePath(r5)     // Catch: java.lang.Exception -> La0
            android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch: java.lang.Exception -> La0
            java.lang.String r1 = "uri"
            kotlin.jvm.internal.s.f(r5, r1)     // Catch: java.lang.Exception -> La0
            expo.modules.interfaces.filesystem.Permission r1 = expo.modules.interfaces.filesystem.Permission.WRITE     // Catch: java.lang.Exception -> La0
            r4.ensurePermission(r5, r1)     // Catch: java.lang.Exception -> La0
            java.lang.String r1 = r5.getScheme()     // Catch: java.lang.Exception -> La0
            java.lang.String r2 = "file"
            boolean r1 = kotlin.jvm.internal.s.c(r1, r2)     // Catch: java.lang.Exception -> La0
            if (r1 == 0) goto L84
            java.io.File r1 = r4.toFile(r5)     // Catch: java.lang.Exception -> La0
            boolean r2 = r1.isDirectory()     // Catch: java.lang.Exception -> La0
            boolean r3 = r6.containsKey(r0)     // Catch: java.lang.Exception -> La0
            if (r3 == 0) goto L50
            java.lang.Object r6 = r6.get(r0)     // Catch: java.lang.Exception -> La0
            if (r6 == 0) goto L48
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Exception -> La0
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Exception -> La0
            if (r6 == 0) goto L50
            r6 = 1
            goto L51
        L48:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException     // Catch: java.lang.Exception -> La0
            java.lang.String r6 = "null cannot be cast to non-null type kotlin.Boolean"
            r5.<init>(r6)     // Catch: java.lang.Exception -> La0
            throw r5     // Catch: java.lang.Exception -> La0
        L50:
            r6 = 0
        L51:
            if (r6 == 0) goto L58
            boolean r0 = r1.mkdirs()     // Catch: java.lang.Exception -> La0
            goto L5c
        L58:
            boolean r0 = r1.mkdir()     // Catch: java.lang.Exception -> La0
        L5c:
            if (r0 != 0) goto L7f
            if (r6 == 0) goto L63
            if (r2 == 0) goto L63
            goto L7f
        L63:
            java.lang.String r6 = "ERR_FILESYSTEM_CANNOT_CREATE_DIRECTORY"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> La0
            r0.<init>()     // Catch: java.lang.Exception -> La0
            java.lang.String r1 = "Directory '"
            r0.append(r1)     // Catch: java.lang.Exception -> La0
            r0.append(r5)     // Catch: java.lang.Exception -> La0
            java.lang.String r5 = "' could not be created or already exists."
            r0.append(r5)     // Catch: java.lang.Exception -> La0
            java.lang.String r5 = r0.toString()     // Catch: java.lang.Exception -> La0
            r7.reject(r6, r5)     // Catch: java.lang.Exception -> La0
            goto Lb2
        L7f:
            r5 = 0
            r7.resolve(r5)     // Catch: java.lang.Exception -> La0
            goto Lb2
        L84:
            java.io.IOException r6 = new java.io.IOException     // Catch: java.lang.Exception -> La0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> La0
            r0.<init>()     // Catch: java.lang.Exception -> La0
            java.lang.String r1 = "Unsupported scheme for location '"
            r0.append(r1)     // Catch: java.lang.Exception -> La0
            r0.append(r5)     // Catch: java.lang.Exception -> La0
            java.lang.String r5 = "'."
            r0.append(r5)     // Catch: java.lang.Exception -> La0
            java.lang.String r5 = r0.toString()     // Catch: java.lang.Exception -> La0
            r6.<init>(r5)     // Catch: java.lang.Exception -> La0
            throw r6     // Catch: java.lang.Exception -> La0
        La0:
            r5 = move-exception
            java.lang.String r6 = r5.getMessage()
            if (r6 != 0) goto La8
            goto Laf
        La8:
            java.lang.String r0 = expo.modules.filesystem.FileSystemModuleKt.access$getTAG$p()
            android.util.Log.e(r0, r6)
        Laf:
            r7.reject(r5)
        Lb2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: expo.modules.filesystem.FileSystemModule.makeDirectoryAsync(java.lang.String, java.util.Map, expo.modules.core.Promise):void");
    }

    @ExpoMethod
    public final void makeSAFDirectoryAsync(String str, String str2, Promise promise) {
        String slashifyFilePath;
        s.g(promise, "promise");
        try {
            slashifyFilePath = FileSystemModuleKt.slashifyFilePath(str);
            Uri uri = Uri.parse(slashifyFilePath);
            s.f(uri, "uri");
            ensurePermission(uri, Permission.WRITE);
            if (isSAFUri(uri)) {
                c4.a nearestSAFFile = getNearestSAFFile(uri);
                if (nearestSAFFile != null && !nearestSAFFile.k()) {
                    promise.reject("ERR_FILESYSTEM_CANNOT_CREATE_DIRECTORY", "Provided uri '" + uri + "' is not pointing to a directory.");
                    return;
                }
                c4.a aVar = null;
                if (str2 != null && nearestSAFFile != null) {
                    aVar = nearestSAFFile.c(str2);
                }
                if (aVar == null) {
                    promise.reject("ERR_FILESYSTEM_CANNOT_CREATE_DIRECTORY", "Unknown error.");
                    return;
                } else {
                    promise.resolve(aVar.j().toString());
                    return;
                }
            }
            throw new IOException("The URI '" + uri + "' is not a Storage Access Framework URI. Try using FileSystem.makeDirectoryAsync instead.");
        } catch (Exception e11) {
            promise.reject(e11);
        }
    }

    @ExpoMethod
    public final void moveAsync(Map<String, ? extends Object> options, Promise promise) {
        String str;
        String slashifyFilePath;
        String slashifyFilePath2;
        s.g(options, "options");
        s.g(promise, "promise");
        try {
            if (options.containsKey("from")) {
                slashifyFilePath = FileSystemModuleKt.slashifyFilePath((String) options.get("from"));
                Uri fromUri = Uri.parse(slashifyFilePath);
                Uri withAppendedPath = Uri.withAppendedPath(fromUri, CallerDataConverter.DEFAULT_RANGE_DELIMITER);
                s.f(withAppendedPath, "withAppendedPath(fromUri, \"..\")");
                Permission permission = Permission.WRITE;
                ensurePermission(withAppendedPath, permission, "Location '" + fromUri + "' isn't movable.");
                if (options.containsKey("to")) {
                    slashifyFilePath2 = FileSystemModuleKt.slashifyFilePath((String) options.get("to"));
                    Uri toUri = Uri.parse(slashifyFilePath2);
                    s.f(toUri, "toUri");
                    ensurePermission(toUri, permission);
                    if (s.c(fromUri.getScheme(), Action.FILE_ATTRIBUTE)) {
                        s.f(fromUri, "fromUri");
                        if (toFile(fromUri).renameTo(toFile(toUri))) {
                            promise.resolve(null);
                            return;
                        }
                        promise.reject("ERR_FILESYSTEM_CANNOT_MOVE_FILE", "File '" + fromUri + "' could not be moved to '" + toUri + "'");
                        return;
                    }
                    s.f(fromUri, "fromUri");
                    if (isSAFUri(fromUri)) {
                        c4.a nearestSAFFile = getNearestSAFFile(fromUri);
                        if (nearestSAFFile != null && nearestSAFFile.f()) {
                            transformFilesFromSAF(nearestSAFFile, new File(toUri.getPath()), false);
                            promise.resolve(null);
                            return;
                        }
                        promise.reject("ERR_FILESYSTEM_CANNOT_MOVE_FILE", "File '" + fromUri + "' could not be moved to '" + toUri + "'");
                        return;
                    }
                    throw new IOException("Unsupported scheme for location '" + fromUri + "'.");
                }
                promise.reject("ERR_FILESYSTEM_MISSING_PARAMETER", "`FileSystem.moveAsync` needs a `to` path.");
                return;
            }
            promise.reject("ERR_FILESYSTEM_MISSING_PARAMETER", "`FileSystem.moveAsync` needs a `from` path.");
        } catch (Exception e11) {
            String message = e11.getMessage();
            if (message != null) {
                str = FileSystemModuleKt.TAG;
                Log.e(str, message);
            }
            promise.reject(e11);
        }
    }

    @ExpoMethod
    public final void networkTaskCancelAsync(String uuid, Promise promise) {
        s.g(uuid, "uuid");
        s.g(promise, "promise");
        TaskHandler taskHandler = this.taskHandlers.get(uuid);
        if (taskHandler != null) {
            taskHandler.getCall().cancel();
        }
        promise.resolve(null);
    }

    @Override // expo.modules.core.interfaces.ActivityEventListener
    public void onActivityResult(Activity activity, int i11, int i12, Intent intent) {
        s.g(activity, "activity");
        if (i11 != 5394 || this.dirPermissionsRequest == null) {
            return;
        }
        Bundle bundle = new Bundle();
        if (i12 == -1 && intent != null) {
            Uri data = intent.getData();
            int flags = intent.getFlags() & 3;
            if (data != null) {
                activity.getContentResolver().takePersistableUriPermission(data, flags);
            }
            bundle.putBoolean(PermissionsResponse.GRANTED_KEY, true);
            bundle.putString("directoryUri", String.valueOf(data));
        } else {
            bundle.putBoolean(PermissionsResponse.GRANTED_KEY, false);
        }
        Promise promise = this.dirPermissionsRequest;
        if (promise != null) {
            promise.resolve(bundle);
        }
        getUIManager().unregisterActivityEventListener(this);
        this.dirPermissionsRequest = null;
    }

    @Override // expo.modules.core.interfaces.RegistryLifecycleListener
    public void onCreate(ModuleRegistry moduleRegistry) {
        s.g(moduleRegistry, "moduleRegistry");
        this.moduleRegistryDelegate.onCreate(moduleRegistry);
    }

    @Override // expo.modules.core.interfaces.ActivityEventListener
    public void onNewIntent(Intent intent) {
        s.g(intent, "intent");
    }

    @ExpoMethod
    public final void readAsStringAsync(String str, Map<String, ? extends Object> options, Promise promise) {
        String str2;
        String slashifyFilePath;
        boolean u11;
        Object i11;
        Object obj;
        s.g(options, "options");
        s.g(promise, "promise");
        try {
            slashifyFilePath = FileSystemModuleKt.slashifyFilePath(str);
            Uri uri = Uri.parse(slashifyFilePath);
            s.f(uri, "uri");
            ensurePermission(uri, Permission.READ);
            u11 = v.u(getEncodingFromOptions(options), ImagePickerConstants.OPTION_BASE64, true);
            if (u11) {
                InputStream inputStream = getInputStream(uri);
                if (options.containsKey("length") && options.containsKey("position")) {
                    Object obj2 = options.get("length");
                    if (obj2 != null) {
                        int intValue = ((Number) obj2).intValue();
                        Object obj3 = options.get("position");
                        if (obj3 != null) {
                            byte[] bArr = new byte[intValue];
                            inputStream.skip(((Number) obj3).intValue());
                            obj = Base64.encodeToString(bArr, 0, inputStream.read(bArr, 0, intValue), 2);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Number");
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Number");
                    }
                } else {
                    obj = Base64.encodeToString(getInputStreamBytes(inputStream), 2);
                }
                b0 b0Var = b0.f54756a;
                b.a(inputStream, null);
            } else {
                if (s.c(uri.getScheme(), Action.FILE_ATTRIBUTE)) {
                    i11 = d.i(new FileInputStream(toFile(uri)));
                } else if (s.c(uri.getScheme(), "asset")) {
                    i11 = d.i(openAssetInputStream(uri));
                } else if (uri.getScheme() == null) {
                    i11 = d.i(openResourceInputStream(str));
                } else if (!isSAFUri(uri)) {
                    throw new IOException("Unsupported scheme for location '" + uri + "'.");
                } else {
                    i11 = d.i(getContext().getContentResolver().openInputStream(uri));
                }
                obj = i11;
            }
            promise.resolve(obj);
        } catch (Exception e11) {
            String message = e11.getMessage();
            if (message != null) {
                str2 = FileSystemModuleKt.TAG;
                Log.e(str2, message);
            }
            promise.reject(e11);
        }
    }

    @ExpoMethod
    public final void readDirectoryAsync(String str, Map<String, ? extends Object> map, Promise promise) {
        String str2;
        String slashifyFilePath;
        s.g(promise, "promise");
        try {
            slashifyFilePath = FileSystemModuleKt.slashifyFilePath(str);
            Uri uri = Uri.parse(slashifyFilePath);
            s.f(uri, "uri");
            ensurePermission(uri, Permission.READ);
            if (s.c(uri.getScheme(), Action.FILE_ATTRIBUTE)) {
                File[] listFiles = toFile(uri).listFiles();
                if (listFiles != null) {
                    ArrayList arrayList = new ArrayList(listFiles.length);
                    int i11 = 0;
                    int length = listFiles.length;
                    while (i11 < length) {
                        File file = listFiles[i11];
                        i11++;
                        arrayList.add(file.getName());
                    }
                    promise.resolve(arrayList);
                    return;
                }
                promise.reject("ERR_FILESYSTEM_CANNOT_READ_DIRECTORY", "Directory '" + uri + "' could not be read.");
            } else if (isSAFUri(uri)) {
                promise.reject("ERR_FILESYSTEM_UNSUPPORTED_SCHEME", "Can't read Storage Access Framework directory, use StorageAccessFramework.readDirectoryAsync() instead.");
            } else {
                throw new IOException("Unsupported scheme for location '" + uri + "'.");
            }
        } catch (Exception e11) {
            String message = e11.getMessage();
            if (message != null) {
                str2 = FileSystemModuleKt.TAG;
                Log.e(str2, message);
            }
            promise.reject(e11);
        }
    }

    @ExpoMethod
    public final void readSAFDirectoryAsync(String str, Map<String, ? extends Object> map, Promise promise) {
        String str2;
        String slashifyFilePath;
        s.g(promise, "promise");
        try {
            slashifyFilePath = FileSystemModuleKt.slashifyFilePath(str);
            Uri uri = Uri.parse(slashifyFilePath);
            s.f(uri, "uri");
            ensurePermission(uri, Permission.READ);
            if (isSAFUri(uri)) {
                c4.a h11 = c4.a.h(getContext(), uri);
                if (h11 != null && h11.f() && h11.k()) {
                    c4.a[] m11 = h11.m();
                    s.f(m11, "file.listFiles()");
                    ArrayList arrayList = new ArrayList(m11.length);
                    int i11 = 0;
                    int length = m11.length;
                    while (i11 < length) {
                        c4.a aVar = m11[i11];
                        i11++;
                        arrayList.add(aVar.j().toString());
                    }
                    promise.resolve(arrayList);
                    return;
                }
                promise.reject("ERR_FILESYSTEM_CANNOT_READ_DIRECTORY", "Uri '" + uri + "' doesn't exist or isn't a directory.");
                return;
            }
            throw new IOException("The URI '" + uri + "' is not a Storage Access Framework URI. Try using FileSystem.readDirectoryAsync instead.");
        } catch (Exception e11) {
            String message = e11.getMessage();
            if (message != null) {
                str2 = FileSystemModuleKt.TAG;
                Log.e(str2, message);
            }
            promise.reject(e11);
        }
    }

    @ExpoMethod
    public final void requestDirectoryPermissionsAsync(String str, Promise promise) {
        String str2;
        k a11;
        String slashifyFilePath;
        s.g(promise, "promise");
        if (this.dirPermissionsRequest != null) {
            promise.reject("ERR_FILESYSTEM_CANNOT_ASK_FOR_PERMISSIONS", "You have an unfinished permission request.");
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
            if (Build.VERSION.SDK_INT >= 26 && str != null) {
                slashifyFilePath = FileSystemModuleKt.slashifyFilePath(str);
                Uri parse = Uri.parse(slashifyFilePath);
                if (parse != null) {
                    intent.putExtra("android.provider.extra.INITIAL_URI", parse);
                }
            }
            a11 = m.a(new FileSystemModule$requestDirectoryPermissionsAsync$$inlined$moduleRegistry$1(this.moduleRegistryDelegate));
            Activity currentActivity = m600requestDirectoryPermissionsAsync$lambda33(a11).getCurrentActivity();
            if (currentActivity == null) {
                promise.reject("ERR_FILESYSTEM_CANNOT_ASK_FOR_PERMISSIONS", "Can't find activity.");
                return;
            }
            getUIManager().registerActivityEventListener(this);
            this.dirPermissionsRequest = promise;
            currentActivity.startActivityForResult(intent, 5394);
        } catch (Exception e11) {
            String message = e11.getMessage();
            if (message != null) {
                str2 = FileSystemModuleKt.TAG;
                Log.e(str2, message);
            }
            promise.reject("ERR_FILESYSTEM_CANNOT_ASK_FOR_PERMISSIONS", "Can't ask for permissions.", e11);
        }
    }

    @ExpoMethod
    public final void uploadAsync(String url, String fileUriString, Map<String, ? extends Object> options, final Promise promise) {
        b0 b0Var;
        s.g(url, "url");
        s.g(fileUriString, "fileUriString");
        s.g(options, "options");
        s.g(promise, "promise");
        Request createUploadRequest = createUploadRequest(url, fileUriString, options, promise, new RequestBodyDecorator() { // from class: expo.modules.filesystem.a
            @Override // expo.modules.filesystem.RequestBodyDecorator
            public final RequestBody decorate(RequestBody requestBody) {
                return FileSystemModule.a(requestBody);
            }
        });
        if (createUploadRequest == null) {
            return;
        }
        OkHttpClient okHttpClient = getOkHttpClient();
        if (okHttpClient == null) {
            b0Var = null;
        } else {
            FirebasePerfOkHttpClient.enqueue(okHttpClient.newCall(createUploadRequest), new Callback() { // from class: expo.modules.filesystem.FileSystemModule$uploadAsync$1$1
                @Override // okhttp3.Callback
                public void onFailure(Call call, IOException e11) {
                    String str;
                    s.g(call, "call");
                    s.g(e11, "e");
                    str = FileSystemModuleKt.TAG;
                    Log.e(str, String.valueOf(e11.getMessage()));
                    Promise.this.reject(e11);
                }

                @Override // okhttp3.Callback
                public void onResponse(Call call, Response response) {
                    s.g(call, "call");
                    s.g(response, "response");
                    Bundle bundle = new Bundle();
                    FileSystemModule fileSystemModule = this;
                    ResponseBody body = response.body();
                    bundle.putString("body", body == null ? null : body.string());
                    bundle.putInt(PermissionsResponse.STATUS_KEY, response.code());
                    bundle.putBundle("headers", FileSystemModule.access$translateHeaders(fileSystemModule, response.headers()));
                    response.close();
                    Promise.this.resolve(bundle);
                }
            });
            b0Var = b0.f54756a;
        }
        if (b0Var == null) {
            promise.reject(new NullPointerException("okHttpClient is null"));
        }
    }

    @ExpoMethod
    public final void uploadTaskStartAsync(String url, String fileUriString, final String uuid, Map<String, ? extends Object> options, final Promise promise) {
        s.g(url, "url");
        s.g(fileUriString, "fileUriString");
        s.g(uuid, "uuid");
        s.g(options, "options");
        s.g(promise, "promise");
        final CountingRequestListener countingRequestListener = new CountingRequestListener() { // from class: expo.modules.filesystem.FileSystemModule$uploadTaskStartAsync$progressListener$1
            private long mLastUpdate = -1;

            /* renamed from: onProgress$lambda-0  reason: not valid java name */
            private static final EventEmitter m603onProgress$lambda0(k<? extends EventEmitter> kVar) {
                EventEmitter value = kVar.getValue();
                s.f(value, "onProgress$lambda-0(...)");
                return value;
            }

            @Override // expo.modules.filesystem.CountingRequestListener
            public void onProgress(long j11, long j12) {
                k a11;
                a11 = m.a(new FileSystemModule$uploadTaskStartAsync$progressListener$1$onProgress$$inlined$moduleRegistry$1(FileSystemModule.access$getModuleRegistryDelegate$p(FileSystemModule.this)));
                Bundle bundle = new Bundle();
                Bundle bundle2 = new Bundle();
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis > this.mLastUpdate + 100 || j11 == j12) {
                    this.mLastUpdate = currentTimeMillis;
                    bundle2.putDouble("totalByteSent", j11);
                    bundle2.putDouble("totalBytesExpectedToSend", j12);
                    bundle.putString(ExponentInstallationId.LEGACY_UUID_KEY, uuid);
                    bundle.putBundle(MessageExtension.FIELD_DATA, bundle2);
                    m603onProgress$lambda0(a11).emit("expo-file-system.uploadProgress", bundle);
                }
            }
        };
        Request createUploadRequest = createUploadRequest(url, fileUriString, options, promise, new RequestBodyDecorator() { // from class: expo.modules.filesystem.FileSystemModule$uploadTaskStartAsync$request$1
            @Override // expo.modules.filesystem.RequestBodyDecorator
            public RequestBody decorate(RequestBody requestBody) {
                s.g(requestBody, "requestBody");
                return new CountingRequestBody(requestBody, CountingRequestListener.this);
            }
        });
        if (createUploadRequest == null) {
            return;
        }
        OkHttpClient okHttpClient = getOkHttpClient();
        s.e(okHttpClient);
        Call newCall = okHttpClient.newCall(createUploadRequest);
        this.taskHandlers.put(uuid, new TaskHandler(newCall));
        FirebasePerfOkHttpClient.enqueue(newCall, new Callback() { // from class: expo.modules.filesystem.FileSystemModule$uploadTaskStartAsync$1
            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException e11) {
                String str;
                s.g(call, "call");
                s.g(e11, "e");
                if (!call.isCanceled()) {
                    str = FileSystemModuleKt.TAG;
                    Log.e(str, String.valueOf(e11.getMessage()));
                    Promise.this.reject(e11);
                    return;
                }
                Promise.this.resolve(null);
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) {
                s.g(call, "call");
                s.g(response, "response");
                Bundle bundle = new Bundle();
                ResponseBody body = response.body();
                FileSystemModule fileSystemModule = this;
                bundle.putString("body", body == null ? null : body.string());
                bundle.putInt(PermissionsResponse.STATUS_KEY, response.code());
                bundle.putBundle("headers", FileSystemModule.access$translateHeaders(fileSystemModule, response.headers()));
                response.close();
                Promise.this.resolve(bundle);
            }
        });
    }

    @ExpoMethod
    public final void writeAsStringAsync(String str, String str2, Map<String, ? extends Object> options, Promise promise) {
        String str3;
        String slashifyFilePath;
        s.g(options, "options");
        s.g(promise, "promise");
        try {
            slashifyFilePath = FileSystemModuleKt.slashifyFilePath(str);
            Uri uri = Uri.parse(slashifyFilePath);
            s.f(uri, "uri");
            ensurePermission(uri, Permission.WRITE);
            String encodingFromOptions = getEncodingFromOptions(options);
            OutputStream outputStream = getOutputStream(uri);
            if (s.c(encodingFromOptions, ImagePickerConstants.OPTION_BASE64)) {
                outputStream.write(Base64.decode(str2, 0));
            } else {
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
                outputStreamWriter.write(str2);
                b0 b0Var = b0.f54756a;
                b.a(outputStreamWriter, null);
            }
            b0 b0Var2 = b0.f54756a;
            b.a(outputStream, null);
            promise.resolve(null);
        } catch (Exception e11) {
            String message = e11.getMessage();
            if (message != null) {
                str3 = FileSystemModuleKt.TAG;
                Log.e(str3, message);
            }
            promise.reject(e11);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileSystemModule(Context context, ModuleRegistryDelegate moduleRegistryDelegate) {
        super(context);
        k a11;
        s.g(context, "context");
        s.g(moduleRegistryDelegate, "moduleRegistryDelegate");
        this.moduleRegistryDelegate = moduleRegistryDelegate;
        try {
            File filesDir = getContext().getFilesDir();
            s.f(filesDir, "getContext().filesDir");
            ensureDirExists(filesDir);
            File cacheDir = getContext().getCacheDir();
            s.f(cacheDir, "getContext().cacheDir");
            ensureDirExists(cacheDir);
        } catch (IOException e11) {
            e11.printStackTrace();
        }
        a11 = m.a(new FileSystemModule$special$$inlined$moduleRegistry$1(this.moduleRegistryDelegate));
        this.uIManager$delegate = a11;
        this.taskHandlers = new HashMap();
    }

    private final void ensurePermission(Uri uri, Permission permission) {
        if (permission == Permission.READ) {
            ensurePermission(uri, permission, "Location '" + uri + "' isn't readable.");
        }
        if (permission == Permission.WRITE) {
            ensurePermission(uri, permission, "Location '" + uri + "' isn't writable.");
        }
        String name = permission.name();
        ensurePermission(uri, permission, "Location '" + uri + "' doesn't have permission '" + name + "'.");
    }
}