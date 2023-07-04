package okhttp3.internal;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.lwansbrough.RCTCamera.RCTCameraModule;
import com.stripe.android.core.networking.NetworkConstantsKt;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.stripe.android.model.Stripe3ds2AuthParams;
import e00.b;
import h00.a;
import h00.l;
import j$.util.DesugarTimeZone;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.r0;
import kotlin.jvm.internal.s;
import kotlin.text.d;
import kotlin.text.i;
import kotlin.text.v;
import kotlin.text.w;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http2.Header;
import okhttp3.internal.io.FileSystem;
import okio.c0;
import okio.e0;
import okio.g;
import okio.h;
import okio.i;
import okio.u;
import vz.b0;
import vz.f;
import wz.n0;
import wz.p;
import wz.s0;
import wz.x;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000°\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000\u001a\u0016\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b\u001a;\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\f*\b\u0012\u0004\u0012\u00020\u00060\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00060\u000e¢\u0006\u0004\b\u0010\u0010\u0011\u001a7\u0010\u0012\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00060\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f2\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00060\u000e¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0014\u0010\u0016\u001a\u00020\u0006*\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\b\u001a-\u0010\u0019\u001a\u00020\u0018*\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u0017\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e¢\u0006\u0004\b\u0019\u0010\u001a\u001a%\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\f*\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001e\u0010\u001f\u001a\u00020\u0018*\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a\u001e\u0010 \u001a\u00020\u0018*\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a\u001e\u0010!\u001a\u00020\u0006*\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a&\u0010#\u001a\u00020\u0018*\u00020\u00062\u0006\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a&\u0010#\u001a\u00020\u0018*\u00020\u00062\u0006\u0010%\u001a\u00020$2\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a\n\u0010&\u001a\u00020\u0018*\u00020\u0006\u001a\n\u0010'\u001a\u00020\b*\u00020\u0006\u001a\u000e\u0010(\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006\u001a)\u0010)\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00062\u0012\u0010+\u001a\n\u0012\u0006\b\u0001\u0012\u00020*0\f\"\u00020*¢\u0006\u0004\b)\u0010,\u001a\u0012\u00100\u001a\u00020.*\u00020-2\u0006\u0010/\u001a\u00020.\u001a \u00104\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u00002\b\u00103\u001a\u0004\u0018\u000102\u001a\n\u00105\u001a\u00020\u0018*\u00020$\u001a\u0010\u00109\u001a\u000208*\b\u0012\u0004\u0012\u00020706\u001a\u0010\u0010:\u001a\b\u0012\u0004\u0012\u00020706*\u000208\u001a\u0012\u0010;\u001a\u00020\b*\u00020\u00142\u0006\u0010\r\u001a\u00020\u0014\u001a\n\u0010>\u001a\u00020=*\u00020<\u001a\u0015\u0010A\u001a\u00020\u0018*\u00020?2\u0006\u0010@\u001a\u00020\u0018H\u0086\u0004\u001a\u0015\u0010A\u001a\u00020\u0018*\u00020B2\u0006\u0010@\u001a\u00020\u0018H\u0086\u0004\u001a\u0015\u0010A\u001a\u00020\u0000*\u00020\u00182\u0006\u0010@\u001a\u00020\u0000H\u0086\u0004\u001a\u0012\u0010E\u001a\u00020\u0004*\u00020C2\u0006\u0010D\u001a\u00020\u0018\u001a\n\u0010F\u001a\u00020\u0018*\u00020-\u001a\u001a\u0010I\u001a\u00020\b*\u00020G2\u0006\u00101\u001a\u00020\u00182\u0006\u0010H\u001a\u000202\u001a\u001a\u0010K\u001a\u00020\b*\u00020G2\u0006\u0010J\u001a\u00020\u00182\u0006\u0010H\u001a\u000202\u001a\n\u0010M\u001a\u00020\u0006*\u00020L\u001a\u0012\u0010O\u001a\u00020\b*\u00020L2\u0006\u0010N\u001a\u00020-\u001a\u001a\u0010R\u001a\u00020\u00042\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00040PH\u0086\bø\u0001\u0000\u001a\"\u0010S\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00040PH\u0086\bø\u0001\u0000\u001a\u0012\u0010I\u001a\u00020\u0018*\u00020T2\u0006\u0010U\u001a\u00020?\u001a\u0014\u0010V\u001a\u00020\u0018*\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u0018\u001a\n\u0010X\u001a\u00020\u0000*\u00020W\u001a\u0012\u0010Z\u001a\u00020\u0000*\u00020\u00062\u0006\u0010Y\u001a\u00020\u0000\u001a\u0014\u0010[\u001a\u00020\u0018*\u0004\u0018\u00010\u00062\u0006\u0010Y\u001a\u00020\u0018\u001a\u001c\u0010]\u001a\b\u0012\u0004\u0012\u00028\u000006\"\u0004\b\u0000\u0010\\*\b\u0012\u0004\u0012\u00028\u000006\u001a/\u0010_\u001a\b\u0012\u0004\u0012\u00028\u000006\"\u0004\b\u0000\u0010\\2\u0012\u0010^\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\f\"\u00028\u0000H\u0007¢\u0006\u0004\b_\u0010`\u001a.\u0010d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010c\"\u0004\b\u0000\u0010a\"\u0004\b\u0001\u0010b*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010c\u001a\n\u0010f\u001a\u00020\u0004*\u00020e\u001a\n\u0010f\u001a\u00020\u0004*\u00020L\u001a\n\u0010f\u001a\u00020\u0004*\u00020g\u001a\u0012\u0010k\u001a\u00020\b*\u00020h2\u0006\u0010j\u001a\u00020i\u001a\n\u0010l\u001a\u00020\u0006*\u00020\u0000\u001a\n\u0010l\u001a\u00020\u0006*\u00020\u0018\u001a\r\u0010m\u001a\u00020\u0004*\u00020*H\u0086\b\u001a\r\u0010n\u001a\u00020\u0004*\u00020*H\u0086\b\u001a\r\u0010o\u001a\u00020\u0004*\u00020*H\u0086\b\u001a3\u0010t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\\2\u0006\u0010p\u001a\u00020*2\f\u0010r\u001a\b\u0012\u0004\u0012\u00028\u00000q2\u0006\u0010s\u001a\u00020\u0006¢\u0006\u0004\bt\u0010u\u001a'\u0010y\u001a\u00020\u0004\"\u0004\b\u0000\u0010v*\b\u0012\u0004\u0012\u00028\u00000w2\u0006\u0010x\u001a\u00028\u0000H\u0000¢\u0006\u0004\by\u0010z\u001a\r\u0010{\u001a\u00020\u0004*\u00020*H\u0080\b\u001a\r\u0010|\u001a\u00020\u0004*\u00020*H\u0080\b\u001a\"\u0010\u0081\u0001\u001a\u00030\u0080\u0001*\u00060}j\u0002`~2\u0010\u0010\u007f\u001a\f\u0012\b\u0012\u00060}j\u0002`~06\u001a:\u0010\u0085\u0001\u001a\b\u0012\u0004\u0012\u00028\u000006\"\u0004\b\u0000\u0010\\*\t\u0012\u0004\u0012\u00028\u00000\u0082\u00012\u0014\u0010\u0084\u0001\u001a\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0083\u0001H\u0086\bø\u0001\u0000\"\u001a\u0010\u0087\u0001\u001a\u00030\u0086\u00018\u0006@\u0007X\u0087\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u0019\u0010\u0089\u0001\u001a\u0002088\u0006@\u0007X\u0087\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u001a\u0010\u008c\u0001\u001a\u00030\u008b\u00018\u0006@\u0007X\u0087\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u001a\u0010\u008f\u0001\u001a\u00030\u008e\u00018\u0006@\u0007X\u0087\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001\"\u001a\u0010\u0092\u0001\u001a\u00030\u0091\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u001a\u0010\u0095\u0001\u001a\u00030\u0094\u00018\u0006@\u0007X\u0087\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u001a\u0010\u0098\u0001\u001a\u00030\u0097\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001\"\u0019\u0010\u009a\u0001\u001a\u00020\b8\u0000@\u0001X\u0081\u0004¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0019\u0010\u009c\u0001\u001a\u00020\u00068\u0000@\u0001X\u0081\u0004¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0019\u0010\u009e\u0001\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009d\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u009f\u0001"}, d2 = {"", "arrayLength", "offset", "count", "Lvz/b0;", "checkOffsetAndCount", "", "name", "", "daemon", "Ljava/util/concurrent/ThreadFactory;", "threadFactory", "", "other", "Ljava/util/Comparator;", "comparator", "intersect", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)[Ljava/lang/String;", "hasIntersection", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z", "Lokhttp3/HttpUrl;", "includeDefaultPort", "toHostHeader", "value", "", "indexOf", "([Ljava/lang/String;Ljava/lang/String;Ljava/util/Comparator;)I", "concat", "([Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;", "startIndex", "endIndex", "indexOfFirstNonAsciiWhitespace", "indexOfLastNonAsciiWhitespace", "trimSubstring", "delimiters", "delimiterOffset", "", "delimiter", "indexOfControlOrNonAscii", "canParseAsIpAddress", "isSensitiveHeader", "format", "", "args", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "Lokio/h;", "Ljava/nio/charset/Charset;", "default", "readBomAsCharset", "duration", "Ljava/util/concurrent/TimeUnit;", "unit", "checkDuration", "parseHexDigit", "", "Lokhttp3/internal/http2/Header;", "Lokhttp3/Headers;", "toHeaders", "toHeaderList", "canReuseConnectionFor", "Lokhttp3/EventListener;", "Lokhttp3/EventListener$Factory;", "asFactory", "", "mask", "and", "", "Lokio/g;", RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_MEDIUM, "writeMedium", "readMedium", "Lokio/e0;", "timeUnit", "skipAll", "timeout", "discard", "Ljava/net/Socket;", "peerName", Stripe3ds2AuthParams.FIELD_SOURCE, "isHealthy", "Lkotlin/Function0;", "block", "ignoreIoExceptions", "threadName", "Lokio/f;", "b", "indexOfNonWhitespace", "Lokhttp3/Response;", "headersContentLength", "defaultValue", "toLongOrDefault", "toNonNegativeInt", "T", "toImmutableList", "elements", "immutableListOf", "([Ljava/lang/Object;)Ljava/util/List;", "K", "V", "", "toImmutableMap", "Ljava/io/Closeable;", "closeQuietly", "Ljava/net/ServerSocket;", "Lokhttp3/internal/io/FileSystem;", "Ljava/io/File;", Action.FILE_ATTRIBUTE, "isCivilized", "toHexString", "wait", "notify", "notifyAll", "instance", "Ljava/lang/Class;", "fieldType", "fieldName", "readFieldOrNull", "(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;", "E", "", "element", "addIfAbsent", "(Ljava/util/List;Ljava/lang/Object;)V", "assertThreadHoldsLock", "assertThreadDoesntHoldLock", "Ljava/lang/Exception;", "Lkotlin/Exception;", "suppressed", "", "withSuppressed", "", "Lkotlin/Function1;", "predicate", "filterList", "", "EMPTY_BYTE_ARRAY", "[B", "EMPTY_HEADERS", "Lokhttp3/Headers;", "Lokhttp3/ResponseBody;", "EMPTY_RESPONSE", "Lokhttp3/ResponseBody;", "Lokhttp3/RequestBody;", "EMPTY_REQUEST", "Lokhttp3/RequestBody;", "Lokio/u;", "UNICODE_BOMS", "Lokio/u;", "Ljava/util/TimeZone;", "UTC", "Ljava/util/TimeZone;", "Lkotlin/text/i;", "VERIFY_AS_IP_ADDRESS", "Lkotlin/text/i;", "assertionsEnabled", "Z", "okHttpName", "Ljava/lang/String;", "userAgent", "okhttp"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class Util {
    public static final byte[] EMPTY_BYTE_ARRAY;
    public static final Headers EMPTY_HEADERS = Headers.Companion.of(new String[0]);
    public static final RequestBody EMPTY_REQUEST;
    public static final ResponseBody EMPTY_RESPONSE;
    private static final u UNICODE_BOMS;
    public static final TimeZone UTC;
    private static final i VERIFY_AS_IP_ADDRESS;
    public static final boolean assertionsEnabled;
    public static final String okHttpName;
    public static final String userAgent = "okhttp/4.9.2";

    static {
        String t02;
        String v02;
        byte[] bArr = new byte[0];
        EMPTY_BYTE_ARRAY = bArr;
        EMPTY_RESPONSE = ResponseBody.Companion.create$default(ResponseBody.Companion, bArr, (MediaType) null, 1, (Object) null);
        EMPTY_REQUEST = RequestBody.Companion.create$default(RequestBody.Companion, bArr, (MediaType) null, 0, 0, 7, (Object) null);
        u.a aVar = u.f42682d;
        i.a aVar2 = okio.i.f42657e;
        UNICODE_BOMS = aVar.d(aVar2.b("efbbbf"), aVar2.b("feff"), aVar2.b("fffe"), aVar2.b("0000ffff"), aVar2.b("ffff0000"));
        TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
        s.e(timeZone);
        UTC = timeZone;
        VERIFY_AS_IP_ADDRESS = new kotlin.text.i("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        assertionsEnabled = false;
        String name = OkHttpClient.class.getName();
        s.f(name, "OkHttpClient::class.java.name");
        t02 = w.t0(name, "okhttp3.");
        v02 = w.v0(t02, "Client");
        okHttpName = v02;
    }

    public static final <E> void addIfAbsent(List<E> addIfAbsent, E e11) {
        s.g(addIfAbsent, "$this$addIfAbsent");
        if (addIfAbsent.contains(e11)) {
            return;
        }
        addIfAbsent.add(e11);
    }

    public static final int and(byte b11, int i11) {
        return b11 & i11;
    }

    public static final int and(short s11, int i11) {
        return s11 & i11;
    }

    public static final long and(int i11, long j11) {
        return i11 & j11;
    }

    public static final EventListener.Factory asFactory(final EventListener asFactory) {
        s.g(asFactory, "$this$asFactory");
        return new EventListener.Factory() { // from class: okhttp3.internal.Util$asFactory$1
            @Override // okhttp3.EventListener.Factory
            public final EventListener create(Call it2) {
                s.g(it2, "it");
                return EventListener.this;
            }
        };
    }

    public static final void assertThreadDoesntHoldLock(Object assertThreadDoesntHoldLock) {
        s.g(assertThreadDoesntHoldLock, "$this$assertThreadDoesntHoldLock");
        if (assertionsEnabled && Thread.holdsLock(assertThreadDoesntHoldLock)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            s.f(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(assertThreadDoesntHoldLock);
            throw new AssertionError(sb2.toString());
        }
    }

    public static final void assertThreadHoldsLock(Object assertThreadHoldsLock) {
        s.g(assertThreadHoldsLock, "$this$assertThreadHoldsLock");
        if (!assertionsEnabled || Thread.holdsLock(assertThreadHoldsLock)) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Thread ");
        Thread currentThread = Thread.currentThread();
        s.f(currentThread, "Thread.currentThread()");
        sb2.append(currentThread.getName());
        sb2.append(" MUST hold lock on ");
        sb2.append(assertThreadHoldsLock);
        throw new AssertionError(sb2.toString());
    }

    public static final boolean canParseAsIpAddress(String canParseAsIpAddress) {
        s.g(canParseAsIpAddress, "$this$canParseAsIpAddress");
        return VERIFY_AS_IP_ADDRESS.g(canParseAsIpAddress);
    }

    public static final boolean canReuseConnectionFor(HttpUrl canReuseConnectionFor, HttpUrl other) {
        s.g(canReuseConnectionFor, "$this$canReuseConnectionFor");
        s.g(other, "other");
        return s.c(canReuseConnectionFor.host(), other.host()) && canReuseConnectionFor.port() == other.port() && s.c(canReuseConnectionFor.scheme(), other.scheme());
    }

    public static final int checkDuration(String name, long j11, TimeUnit timeUnit) {
        s.g(name, "name");
        int i11 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        boolean z11 = true;
        if (!(i11 >= 0)) {
            throw new IllegalStateException((name + " < 0").toString());
        }
        if (timeUnit != null) {
            long millis = timeUnit.toMillis(j11);
            if (!(millis <= ((long) Integer.MAX_VALUE))) {
                throw new IllegalArgumentException((name + " too large.").toString());
            }
            if (millis == 0 && i11 > 0) {
                z11 = false;
            }
            if (z11) {
                return (int) millis;
            }
            throw new IllegalArgumentException((name + " too small.").toString());
        }
        throw new IllegalStateException("unit == null".toString());
    }

    public static final void checkOffsetAndCount(long j11, long j12, long j13) {
        if ((j12 | j13) < 0 || j12 > j11 || j11 - j12 < j13) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void closeQuietly(Closeable closeQuietly) {
        s.g(closeQuietly, "$this$closeQuietly");
        try {
            closeQuietly.close();
        } catch (RuntimeException e11) {
            throw e11;
        } catch (Exception unused) {
        }
    }

    public static final String[] concat(String[] concat, String value) {
        int L;
        s.g(concat, "$this$concat");
        s.g(value, "value");
        Object[] copyOf = Arrays.copyOf(concat, concat.length + 1);
        s.f(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        String[] strArr = (String[]) copyOf;
        L = p.L(strArr);
        strArr[L] = value;
        return strArr;
    }

    public static final int delimiterOffset(String delimiterOffset, String delimiters, int i11, int i12) {
        boolean L;
        s.g(delimiterOffset, "$this$delimiterOffset");
        s.g(delimiters, "delimiters");
        while (i11 < i12) {
            L = w.L(delimiters, delimiterOffset.charAt(i11), false, 2, null);
            if (L) {
                return i11;
            }
            i11++;
        }
        return i12;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, String str2, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = str.length();
        }
        return delimiterOffset(str, str2, i11, i12);
    }

    public static final boolean discard(e0 discard, int i11, TimeUnit timeUnit) {
        s.g(discard, "$this$discard");
        s.g(timeUnit, "timeUnit");
        try {
            return skipAll(discard, i11, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final <T> List<T> filterList(Iterable<? extends T> filterList, l<? super T, Boolean> predicate) {
        List<T> i11;
        s.g(filterList, "$this$filterList");
        s.g(predicate, "predicate");
        i11 = wz.w.i();
        Iterator<? extends T> it2 = filterList.iterator();
        while (it2.hasNext()) {
            Object obj = (T) it2.next();
            if (predicate.invoke(obj).booleanValue()) {
                if (i11.isEmpty()) {
                    i11 = new ArrayList<>();
                }
                r0.c(i11).add(obj);
            }
        }
        return i11;
    }

    public static final String format(String format, Object... args) {
        s.g(format, "format");
        s.g(args, "args");
        q0 q0Var = q0.f34921a;
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(args, args.length);
        String format2 = String.format(locale, format, Arrays.copyOf(copyOf, copyOf.length));
        s.f(format2, "java.lang.String.format(locale, format, *args)");
        return format2;
    }

    public static final boolean hasIntersection(String[] hasIntersection, String[] strArr, Comparator<? super String> comparator) {
        s.g(hasIntersection, "$this$hasIntersection");
        s.g(comparator, "comparator");
        if (!(hasIntersection.length == 0) && strArr != null) {
            if (!(strArr.length == 0)) {
                for (String str : hasIntersection) {
                    for (String str2 : strArr) {
                        if (comparator.compare(str, str2) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final long headersContentLength(Response headersContentLength) {
        s.g(headersContentLength, "$this$headersContentLength");
        String str = headersContentLength.headers().get("Content-Length");
        if (str != null) {
            return toLongOrDefault(str, -1L);
        }
        return -1L;
    }

    public static final void ignoreIoExceptions(a<b0> block) {
        s.g(block, "block");
        try {
            block.invoke();
        } catch (IOException unused) {
        }
    }

    @SafeVarargs
    public static final <T> List<T> immutableListOf(T... elements) {
        List l11;
        s.g(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        l11 = wz.w.l(Arrays.copyOf(objArr, objArr.length));
        List<T> unmodifiableList = Collections.unmodifiableList(l11);
        s.f(unmodifiableList, "Collections.unmodifiable…istOf(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int indexOf(String[] indexOf, String value, Comparator<String> comparator) {
        s.g(indexOf, "$this$indexOf");
        s.g(value, "value");
        s.g(comparator, "comparator");
        int length = indexOf.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (comparator.compare(indexOf[i11], value) == 0) {
                return i11;
            }
        }
        return -1;
    }

    public static final int indexOfControlOrNonAscii(String indexOfControlOrNonAscii) {
        s.g(indexOfControlOrNonAscii, "$this$indexOfControlOrNonAscii");
        int length = indexOfControlOrNonAscii.length();
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = indexOfControlOrNonAscii.charAt(i11);
            if (s.i(charAt, 31) <= 0 || s.i(charAt, 127) >= 0) {
                return i11;
            }
        }
        return -1;
    }

    public static final int indexOfFirstNonAsciiWhitespace(String indexOfFirstNonAsciiWhitespace, int i11, int i12) {
        s.g(indexOfFirstNonAsciiWhitespace, "$this$indexOfFirstNonAsciiWhitespace");
        while (i11 < i12) {
            char charAt = indexOfFirstNonAsciiWhitespace.charAt(i11);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i11;
            }
            i11++;
        }
        return i12;
    }

    public static /* synthetic */ int indexOfFirstNonAsciiWhitespace$default(String str, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = str.length();
        }
        return indexOfFirstNonAsciiWhitespace(str, i11, i12);
    }

    public static final int indexOfLastNonAsciiWhitespace(String indexOfLastNonAsciiWhitespace, int i11, int i12) {
        s.g(indexOfLastNonAsciiWhitespace, "$this$indexOfLastNonAsciiWhitespace");
        int i13 = i12 - 1;
        if (i13 >= i11) {
            while (true) {
                char charAt = indexOfLastNonAsciiWhitespace.charAt(i13);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i13 + 1;
                }
                if (i13 == i11) {
                    break;
                }
                i13--;
            }
        }
        return i11;
    }

    public static /* synthetic */ int indexOfLastNonAsciiWhitespace$default(String str, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = str.length();
        }
        return indexOfLastNonAsciiWhitespace(str, i11, i12);
    }

    public static final int indexOfNonWhitespace(String indexOfNonWhitespace, int i11) {
        s.g(indexOfNonWhitespace, "$this$indexOfNonWhitespace");
        int length = indexOfNonWhitespace.length();
        while (i11 < length) {
            char charAt = indexOfNonWhitespace.charAt(i11);
            if (charAt != ' ' && charAt != '\t') {
                return i11;
            }
            i11++;
        }
        return indexOfNonWhitespace.length();
    }

    public static /* synthetic */ int indexOfNonWhitespace$default(String str, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        return indexOfNonWhitespace(str, i11);
    }

    public static final String[] intersect(String[] intersect, String[] other, Comparator<? super String> comparator) {
        s.g(intersect, "$this$intersect");
        s.g(other, "other");
        s.g(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : intersect) {
            int length = other.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                } else if (comparator.compare(str, other[i11]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i11++;
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return (String[]) array;
    }

    public static final boolean isCivilized(FileSystem isCivilized, File file) {
        s.g(isCivilized, "$this$isCivilized");
        s.g(file, "file");
        c0 sink = isCivilized.sink(file);
        try {
            try {
                isCivilized.delete(file);
                b.a(sink, null);
                return true;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    b.a(sink, th2);
                    throw th3;
                }
            }
        } catch (IOException unused) {
            b0 b0Var = b0.f54756a;
            b.a(sink, null);
            isCivilized.delete(file);
            return false;
        }
    }

    public static final boolean isHealthy(Socket isHealthy, h source) {
        s.g(isHealthy, "$this$isHealthy");
        s.g(source, "source");
        try {
            int soTimeout = isHealthy.getSoTimeout();
            try {
                isHealthy.setSoTimeout(1);
                boolean z11 = !source.N0();
                isHealthy.setSoTimeout(soTimeout);
                return z11;
            } catch (Throwable th2) {
                isHealthy.setSoTimeout(soTimeout);
                throw th2;
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final boolean isSensitiveHeader(String name) {
        boolean u11;
        boolean u12;
        boolean u13;
        boolean u14;
        s.g(name, "name");
        u11 = v.u(name, NetworkConstantsKt.HEADER_AUTHORIZATION, true);
        if (u11) {
            return true;
        }
        u12 = v.u(name, RequestHeadersFactory.FraudDetection.HEADER_COOKIE, true);
        if (u12) {
            return true;
        }
        u13 = v.u(name, "Proxy-Authorization", true);
        if (u13) {
            return true;
        }
        u14 = v.u(name, "Set-Cookie", true);
        return u14;
    }

    public static final void notify(Object notify) {
        s.g(notify, "$this$notify");
        notify.notify();
    }

    public static final void notifyAll(Object notifyAll) {
        s.g(notifyAll, "$this$notifyAll");
        notifyAll.notifyAll();
    }

    public static final int parseHexDigit(char c11) {
        if ('0' <= c11 && '9' >= c11) {
            return c11 - '0';
        }
        char c12 = 'a';
        if ('a' > c11 || 'f' < c11) {
            c12 = 'A';
            if ('A' > c11 || 'F' < c11) {
                return -1;
            }
        }
        return (c11 - c12) + 10;
    }

    public static final String peerName(Socket peerName) {
        s.g(peerName, "$this$peerName");
        SocketAddress remoteSocketAddress = peerName.getRemoteSocketAddress();
        if (remoteSocketAddress instanceof InetSocketAddress) {
            String hostName = ((InetSocketAddress) remoteSocketAddress).getHostName();
            s.f(hostName, "address.hostName");
            return hostName;
        }
        return remoteSocketAddress.toString();
    }

    public static final Charset readBomAsCharset(h readBomAsCharset, Charset charset) {
        s.g(readBomAsCharset, "$this$readBomAsCharset");
        s.g(charset, "default");
        int J1 = readBomAsCharset.J1(UNICODE_BOMS);
        if (J1 != -1) {
            if (J1 == 0) {
                Charset UTF_8 = StandardCharsets.UTF_8;
                s.f(UTF_8, "UTF_8");
                return UTF_8;
            } else if (J1 == 1) {
                Charset UTF_16BE = StandardCharsets.UTF_16BE;
                s.f(UTF_16BE, "UTF_16BE");
                return UTF_16BE;
            } else if (J1 == 2) {
                Charset UTF_16LE = StandardCharsets.UTF_16LE;
                s.f(UTF_16LE, "UTF_16LE");
                return UTF_16LE;
            } else if (J1 != 3) {
                if (J1 == 4) {
                    return d.f35186a.b();
                }
                throw new AssertionError();
            } else {
                return d.f35186a.a();
            }
        }
        return charset;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0039, code lost:
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> T readFieldOrNull(java.lang.Object r6, java.lang.Class<T> r7, java.lang.String r8) {
        /*
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "instance"
            kotlin.jvm.internal.s.g(r6, r1)
            java.lang.String r1 = "fieldType"
            kotlin.jvm.internal.s.g(r7, r1)
            java.lang.String r1 = "fieldName"
            kotlin.jvm.internal.s.g(r8, r1)
            java.lang.Class r1 = r6.getClass()
        L15:
            boolean r2 = kotlin.jvm.internal.s.c(r1, r0)
            r3 = 1
            r2 = r2 ^ r3
            r4 = 0
            if (r2 == 0) goto L44
            java.lang.reflect.Field r2 = r1.getDeclaredField(r8)     // Catch: java.lang.NoSuchFieldException -> L3a
            java.lang.String r5 = "field"
            kotlin.jvm.internal.s.f(r2, r5)     // Catch: java.lang.NoSuchFieldException -> L3a
            r2.setAccessible(r3)     // Catch: java.lang.NoSuchFieldException -> L3a
            java.lang.Object r2 = r2.get(r6)     // Catch: java.lang.NoSuchFieldException -> L3a
            boolean r3 = r7.isInstance(r2)     // Catch: java.lang.NoSuchFieldException -> L3a
            if (r3 != 0) goto L35
            goto L39
        L35:
            java.lang.Object r4 = r7.cast(r2)     // Catch: java.lang.NoSuchFieldException -> L3a
        L39:
            return r4
        L3a:
            java.lang.Class r1 = r1.getSuperclass()
            java.lang.String r2 = "c.superclass"
            kotlin.jvm.internal.s.f(r1, r2)
            goto L15
        L44:
            java.lang.String r1 = "delegate"
            boolean r2 = kotlin.jvm.internal.s.c(r8, r1)
            r2 = r2 ^ r3
            if (r2 == 0) goto L58
            java.lang.Object r6 = readFieldOrNull(r6, r0, r1)
            if (r6 == 0) goto L58
            java.lang.Object r6 = readFieldOrNull(r6, r7, r8)
            return r6
        L58:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.Util.readFieldOrNull(java.lang.Object, java.lang.Class, java.lang.String):java.lang.Object");
    }

    public static final int readMedium(h readMedium) {
        s.g(readMedium, "$this$readMedium");
        return and(readMedium.readByte(), 255) | (and(readMedium.readByte(), 255) << 16) | (and(readMedium.readByte(), 255) << 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0051, code lost:
        if (r5 == Long.MAX_VALUE) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0053, code lost:
        r11.timeout().clearDeadline();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x005b, code lost:
        r11.timeout().deadlineNanoTime(r0 + r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x007d, code lost:
        if (r5 != Long.MAX_VALUE) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0080, code lost:
        return r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean skipAll(okio.e0 r11, int r12, java.util.concurrent.TimeUnit r13) {
        /*
            java.lang.String r0 = "$this$skipAll"
            kotlin.jvm.internal.s.g(r11, r0)
            java.lang.String r0 = "timeUnit"
            kotlin.jvm.internal.s.g(r13, r0)
            long r0 = java.lang.System.nanoTime()
            okio.f0 r2 = r11.timeout()
            boolean r2 = r2.hasDeadline()
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r2 == 0) goto L27
            okio.f0 r2 = r11.timeout()
            long r5 = r2.deadlineNanoTime()
            long r5 = r5 - r0
            goto L28
        L27:
            r5 = r3
        L28:
            okio.f0 r2 = r11.timeout()
            long r7 = (long) r12
            long r12 = r13.toNanos(r7)
            long r12 = java.lang.Math.min(r5, r12)
            long r12 = r12 + r0
            r2.deadlineNanoTime(r12)
            okio.f r12 = new okio.f     // Catch: java.lang.Throwable -> L64 java.io.InterruptedIOException -> L7a
            r12.<init>()     // Catch: java.lang.Throwable -> L64 java.io.InterruptedIOException -> L7a
        L3e:
            r7 = 8192(0x2000, double:4.0474E-320)
            long r7 = r11.read(r12, r7)     // Catch: java.lang.Throwable -> L64 java.io.InterruptedIOException -> L7a
            r9 = -1
            int r13 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r13 == 0) goto L4e
            r12.a()     // Catch: java.lang.Throwable -> L64 java.io.InterruptedIOException -> L7a
            goto L3e
        L4e:
            r12 = 1
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L5b
        L53:
            okio.f0 r11 = r11.timeout()
            r11.clearDeadline()
            goto L80
        L5b:
            okio.f0 r11 = r11.timeout()
            long r0 = r0 + r5
            r11.deadlineNanoTime(r0)
            goto L80
        L64:
            r12 = move-exception
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L71
            okio.f0 r11 = r11.timeout()
            r11.clearDeadline()
            goto L79
        L71:
            okio.f0 r11 = r11.timeout()
            long r0 = r0 + r5
            r11.deadlineNanoTime(r0)
        L79:
            throw r12
        L7a:
            r12 = 0
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L5b
            goto L53
        L80:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.Util.skipAll(okio.e0, int, java.util.concurrent.TimeUnit):boolean");
    }

    public static final ThreadFactory threadFactory(final String name, final boolean z11) {
        s.g(name, "name");
        return new ThreadFactory() { // from class: okhttp3.internal.Util$threadFactory$1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, name);
                thread.setDaemon(z11);
                return thread;
            }
        };
    }

    public static final void threadName(String name, a<b0> block) {
        s.g(name, "name");
        s.g(block, "block");
        Thread currentThread = Thread.currentThread();
        s.f(currentThread, "currentThread");
        String name2 = currentThread.getName();
        currentThread.setName(name);
        try {
            block.invoke();
        } finally {
            q.b(1);
            currentThread.setName(name2);
            q.a(1);
        }
    }

    public static final List<Header> toHeaderList(Headers toHeaderList) {
        m00.i r11;
        int t11;
        s.g(toHeaderList, "$this$toHeaderList");
        r11 = m00.l.r(0, toHeaderList.size());
        t11 = x.t(r11, 10);
        ArrayList arrayList = new ArrayList(t11);
        Iterator<Integer> it2 = r11.iterator();
        while (it2.hasNext()) {
            int a11 = ((n0) it2).a();
            arrayList.add(new Header(toHeaderList.name(a11), toHeaderList.value(a11)));
        }
        return arrayList;
    }

    public static final Headers toHeaders(List<Header> toHeaders) {
        s.g(toHeaders, "$this$toHeaders");
        Headers.Builder builder = new Headers.Builder();
        for (Header header : toHeaders) {
            builder.addLenient$okhttp(header.component1().F(), header.component2().F());
        }
        return builder.build();
    }

    public static final String toHexString(long j11) {
        String hexString = Long.toHexString(j11);
        s.f(hexString, "java.lang.Long.toHexString(this)");
        return hexString;
    }

    public static final String toHostHeader(HttpUrl toHostHeader, boolean z11) {
        boolean M;
        String host;
        s.g(toHostHeader, "$this$toHostHeader");
        M = w.M(toHostHeader.host(), ":", false, 2, null);
        if (M) {
            host = '[' + toHostHeader.host() + ']';
        } else {
            host = toHostHeader.host();
        }
        if (z11 || toHostHeader.port() != HttpUrl.Companion.defaultPort(toHostHeader.scheme())) {
            return host + CoreConstants.COLON_CHAR + toHostHeader.port();
        }
        return host;
    }

    public static /* synthetic */ String toHostHeader$default(HttpUrl httpUrl, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return toHostHeader(httpUrl, z11);
    }

    public static final <T> List<T> toImmutableList(List<? extends T> toImmutableList) {
        List Q0;
        s.g(toImmutableList, "$this$toImmutableList");
        Q0 = wz.e0.Q0(toImmutableList);
        List<T> unmodifiableList = Collections.unmodifiableList(Q0);
        s.f(unmodifiableList, "Collections.unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    public static final <K, V> Map<K, V> toImmutableMap(Map<K, ? extends V> toImmutableMap) {
        Map<K, V> i11;
        s.g(toImmutableMap, "$this$toImmutableMap");
        if (toImmutableMap.isEmpty()) {
            i11 = s0.i();
            return i11;
        }
        Map<K, V> unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(toImmutableMap));
        s.f(unmodifiableMap, "Collections.unmodifiableMap(LinkedHashMap(this))");
        return unmodifiableMap;
    }

    public static final long toLongOrDefault(String toLongOrDefault, long j11) {
        s.g(toLongOrDefault, "$this$toLongOrDefault");
        try {
            return Long.parseLong(toLongOrDefault);
        } catch (NumberFormatException unused) {
            return j11;
        }
    }

    public static final int toNonNegativeInt(String str, int i11) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        return i11;
    }

    public static final String trimSubstring(String trimSubstring, int i11, int i12) {
        s.g(trimSubstring, "$this$trimSubstring");
        int indexOfFirstNonAsciiWhitespace = indexOfFirstNonAsciiWhitespace(trimSubstring, i11, i12);
        String substring = trimSubstring.substring(indexOfFirstNonAsciiWhitespace, indexOfLastNonAsciiWhitespace(trimSubstring, indexOfFirstNonAsciiWhitespace, i12));
        s.f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String trimSubstring$default(String str, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = str.length();
        }
        return trimSubstring(str, i11, i12);
    }

    public static final void wait(Object wait) {
        s.g(wait, "$this$wait");
        wait.wait();
    }

    public static final Throwable withSuppressed(Exception withSuppressed, List<? extends Exception> suppressed) {
        s.g(withSuppressed, "$this$withSuppressed");
        s.g(suppressed, "suppressed");
        if (suppressed.size() > 1) {
            System.out.println(suppressed);
        }
        for (Exception exc : suppressed) {
            f.a(withSuppressed, exc);
        }
        return withSuppressed;
    }

    public static final void writeMedium(g writeMedium, int i11) {
        s.g(writeMedium, "$this$writeMedium");
        writeMedium.O0((i11 >>> 16) & 255);
        writeMedium.O0((i11 >>> 8) & 255);
        writeMedium.O0(i11 & 255);
    }

    public static final int delimiterOffset(String delimiterOffset, char c11, int i11, int i12) {
        s.g(delimiterOffset, "$this$delimiterOffset");
        while (i11 < i12) {
            if (delimiterOffset.charAt(i11) == c11) {
                return i11;
            }
            i11++;
        }
        return i12;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, char c11, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = str.length();
        }
        return delimiterOffset(str, c11, i11, i12);
    }

    public static final String toHexString(int i11) {
        String hexString = Integer.toHexString(i11);
        s.f(hexString, "Integer.toHexString(this)");
        return hexString;
    }

    public static final void closeQuietly(Socket closeQuietly) {
        s.g(closeQuietly, "$this$closeQuietly");
        try {
            closeQuietly.close();
        } catch (AssertionError e11) {
            throw e11;
        } catch (RuntimeException e12) {
            if (!s.c(e12.getMessage(), "bio == null")) {
                throw e12;
            }
        } catch (Exception unused) {
        }
    }

    public static final void closeQuietly(ServerSocket closeQuietly) {
        s.g(closeQuietly, "$this$closeQuietly");
        try {
            closeQuietly.close();
        } catch (RuntimeException e11) {
            throw e11;
        } catch (Exception unused) {
        }
    }

    public static final int skipAll(okio.f skipAll, byte b11) {
        s.g(skipAll, "$this$skipAll");
        int i11 = 0;
        while (!skipAll.N0() && skipAll.J(0L) == b11) {
            i11++;
            skipAll.readByte();
        }
        return i11;
    }
}