package okhttp3;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.model.payments.request.CardPaymentMethod;
import com.google.android.gms.actions.SearchIntents;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.text.i;
import kotlin.text.v;
import kotlin.text.w;
import m00.g;
import m00.l;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import okio.f;
import org.spongycastle.math.Primes;
import wz.x;
import wz.x0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b%\n\u0002\u0010\"\n\u0002\b\u0013\u0018\u0000 P2\u00020\u0001:\u0002QPBc\b\u0000\u0012\u0006\u0010\"\u001a\u00020\n\u0012\u0006\u0010&\u001a\u00020\n\u0012\u0006\u0010*\u001a\u00020\n\u0012\u0006\u0010,\u001a\u00020\n\u0012\u0006\u0010/\u001a\u00020\u000f\u0012\f\u00108\u001a\b\u0012\u0004\u0012\u00020\n0\r\u0012\u0010\u0010M\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\r\u0012\b\u0010F\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0003\u001a\u00020\n¢\u0006\u0004\bN\u0010OJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\nJ\u0016\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\r2\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0013\u001a\u00020\nJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0014\u001a\u00020\nJ\u0006\u0010\u0017\u001a\u00020\u0016J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0014\u001a\u00020\nJ\u0013\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001b\u001a\u00020\u000fH\u0016J\b\u0010\u001c\u001a\u00020\nH\u0016J\b\u0010\u001d\u001a\u0004\u0018\u00010\nJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001e\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001f\u0010\bJ\u000f\u0010\"\u001a\u00020\nH\u0007¢\u0006\u0004\b \u0010!J\u000f\u0010$\u001a\u00020\nH\u0007¢\u0006\u0004\b#\u0010!J\u000f\u0010&\u001a\u00020\nH\u0007¢\u0006\u0004\b%\u0010!J\u000f\u0010(\u001a\u00020\nH\u0007¢\u0006\u0004\b'\u0010!J\u000f\u0010*\u001a\u00020\nH\u0007¢\u0006\u0004\b)\u0010!J\u000f\u0010,\u001a\u00020\nH\u0007¢\u0006\u0004\b+\u0010!J\u000f\u0010/\u001a\u00020\u000fH\u0007¢\u0006\u0004\b-\u0010.J\u000f\u00101\u001a\u00020\u000fH\u0007¢\u0006\u0004\b0\u0010.J\u000f\u00103\u001a\u00020\nH\u0007¢\u0006\u0004\b2\u0010!J\u0015\u00106\u001a\b\u0012\u0004\u0012\u00020\n0\rH\u0007¢\u0006\u0004\b4\u00105J\u0015\u00108\u001a\b\u0012\u0004\u0012\u00020\n0\rH\u0007¢\u0006\u0004\b7\u00105J\u0011\u0010:\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b9\u0010!J\u0011\u0010<\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b;\u0010!J\u000f\u0010>\u001a\u00020\u000fH\u0007¢\u0006\u0004\b=\u0010.J\u0015\u0010B\u001a\b\u0012\u0004\u0012\u00020\n0?H\u0007¢\u0006\u0004\b@\u0010AJ\u0011\u0010D\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\bC\u0010!J\u0011\u0010F\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\bE\u0010!R\u0019\u0010G\u001a\u00020\u00198\u0006@\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bG\u0010IR\u0019\u0010\"\u001a\u00020\n8\u0007@\u0006¢\u0006\f\n\u0004\b\"\u0010J\u001a\u0004\b\"\u0010!R\u0019\u0010&\u001a\u00020\n8\u0007@\u0006¢\u0006\f\n\u0004\b&\u0010J\u001a\u0004\b&\u0010!R\u0019\u0010*\u001a\u00020\n8\u0007@\u0006¢\u0006\f\n\u0004\b*\u0010J\u001a\u0004\b*\u0010!R\u0019\u0010,\u001a\u00020\n8\u0007@\u0006¢\u0006\f\n\u0004\b,\u0010J\u001a\u0004\b,\u0010!R\u0019\u0010/\u001a\u00020\u000f8\u0007@\u0006¢\u0006\f\n\u0004\b/\u0010K\u001a\u0004\b/\u0010.R\u001f\u00108\u001a\b\u0012\u0004\u0012\u00020\n0\r8\u0007@\u0006¢\u0006\f\n\u0004\b8\u0010L\u001a\u0004\b8\u00105R \u0010M\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010LR\u001b\u0010F\u001a\u0004\u0018\u00010\n8\u0007@\u0006¢\u0006\f\n\u0004\bF\u0010J\u001a\u0004\bF\u0010!R\u0016\u0010\u0003\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010JR\u0013\u0010$\u001a\u00020\n8G@\u0006¢\u0006\u0006\u001a\u0004\b$\u0010!R\u0013\u0010(\u001a\u00020\n8G@\u0006¢\u0006\u0006\u001a\u0004\b(\u0010!R\u0013\u00101\u001a\u00020\u000f8G@\u0006¢\u0006\u0006\u001a\u0004\b1\u0010.R\u0013\u00103\u001a\u00020\n8G@\u0006¢\u0006\u0006\u001a\u0004\b3\u0010!R\u0019\u00106\u001a\b\u0012\u0004\u0012\u00020\n0\r8G@\u0006¢\u0006\u0006\u001a\u0004\b6\u00105R\u0015\u0010:\u001a\u0004\u0018\u00010\n8G@\u0006¢\u0006\u0006\u001a\u0004\b:\u0010!R\u0015\u0010<\u001a\u0004\u0018\u00010\n8G@\u0006¢\u0006\u0006\u001a\u0004\b<\u0010!R\u0013\u0010>\u001a\u00020\u000f8G@\u0006¢\u0006\u0006\u001a\u0004\b>\u0010.R\u0019\u0010B\u001a\b\u0012\u0004\u0012\u00020\n0?8G@\u0006¢\u0006\u0006\u001a\u0004\bB\u0010AR\u0015\u0010D\u001a\u0004\u0018\u00010\n8G@\u0006¢\u0006\u0006\u001a\u0004\bD\u0010!¨\u0006R"}, d2 = {"Lokhttp3/HttpUrl;", "", "Ljava/net/URL;", "url", "()Ljava/net/URL;", "toUrl", "Ljava/net/URI;", "uri", "()Ljava/net/URI;", "toUri", "", "name", "queryParameter", "", "queryParameterValues", "", "index", "queryParameterName", "queryParameterValue", "redact", "link", "resolve", "Lokhttp3/HttpUrl$Builder;", "newBuilder", "other", "", "equals", "hashCode", "toString", "topPrivateDomain", "-deprecated_url", "-deprecated_uri", "-deprecated_scheme", "()Ljava/lang/String;", CardPaymentMethod.PAYMENT_METHOD_TYPE, "-deprecated_encodedUsername", "encodedUsername", "-deprecated_username", "username", "-deprecated_encodedPassword", "encodedPassword", "-deprecated_password", "password", "-deprecated_host", "host", "-deprecated_port", "()I", "port", "-deprecated_pathSize", "pathSize", "-deprecated_encodedPath", "encodedPath", "-deprecated_encodedPathSegments", "()Ljava/util/List;", "encodedPathSegments", "-deprecated_pathSegments", "pathSegments", "-deprecated_encodedQuery", "encodedQuery", "-deprecated_query", SearchIntents.EXTRA_QUERY, "-deprecated_querySize", "querySize", "", "-deprecated_queryParameterNames", "()Ljava/util/Set;", "queryParameterNames", "-deprecated_encodedFragment", "encodedFragment", "-deprecated_fragment", "fragment", "isHttps", "Z", "()Z", "Ljava/lang/String;", "I", "Ljava/util/List;", "queryNamesAndValues", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "Builder", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class HttpUrl {
    public static final String FORM_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#&!$(),~";
    public static final String FRAGMENT_ENCODE_SET = "";
    public static final String FRAGMENT_ENCODE_SET_URI = " \"#<>\\^`{|}";
    public static final String PASSWORD_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    public static final String PATH_SEGMENT_ENCODE_SET = " \"<>^`{}|/\\?#";
    public static final String PATH_SEGMENT_ENCODE_SET_URI = "[]";
    public static final String QUERY_COMPONENT_ENCODE_SET = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";
    public static final String QUERY_COMPONENT_ENCODE_SET_URI = "\\^`{|}";
    public static final String QUERY_COMPONENT_REENCODE_SET = " \"'<>#&=";
    public static final String QUERY_ENCODE_SET = " \"'<>#";
    public static final String USERNAME_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    private final String fragment;
    private final String host;
    private final boolean isHttps;
    private final String password;
    private final List<String> pathSegments;
    private final int port;
    private final List<String> queryNamesAndValues;
    private final String scheme;
    private final String url;
    private final String username;
    public static final Companion Companion = new Companion(null);
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010!\n\u0002\b\r\u0018\u0000 \\2\u00020\u0001:\u0001\\B\u0007¢\u0006\u0004\bZ\u0010[J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004H\u0002J \u0010\u000f\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0002J0\u0010\u0012\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0004H\u0002J\b\u0010\u0015\u001a\u00020\nH\u0002J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0004J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0004J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0004J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0004J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0004J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0004J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0002J\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010 \u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0004J\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0004J\u0016\u0010$\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0004J\u0016\u0010%\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0004J\u000e\u0010&\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0002J\u000e\u0010'\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0004J\u0010\u0010(\u001a\u00020\u00002\b\u0010(\u001a\u0004\u0018\u00010\u0004J\u0010\u0010)\u001a\u00020\u00002\b\u0010)\u001a\u0004\u0018\u00010\u0004J\u0018\u0010,\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u00042\b\u0010+\u001a\u0004\u0018\u00010\u0004J\u0018\u0010/\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u00042\b\u0010.\u001a\u0004\u0018\u00010\u0004J\u0018\u00100\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u00042\b\u0010+\u001a\u0004\u0018\u00010\u0004J\u0018\u00101\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u00042\b\u0010.\u001a\u0004\u0018\u00010\u0004J\u000e\u00102\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u0004J\u000e\u00103\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u0004J\u0010\u00104\u001a\u00020\u00002\b\u00104\u001a\u0004\u0018\u00010\u0004J\u0010\u00105\u001a\u00020\u00002\b\u00105\u001a\u0004\u0018\u00010\u0004J\u000f\u00108\u001a\u00020\u0000H\u0000¢\u0006\u0004\b6\u00107J\u0006\u0010:\u001a\u000209J\b\u0010;\u001a\u00020\u0004H\u0016J!\u0010?\u001a\u00020\u00002\b\u0010<\u001a\u0004\u0018\u0001092\u0006\u0010\f\u001a\u00020\u0004H\u0000¢\u0006\u0004\b=\u0010>R$\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010\u0018\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010@\u001a\u0004\bE\u0010B\"\u0004\bF\u0010DR\"\u0010\u001a\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010@\u001a\u0004\bG\u0010B\"\u0004\bH\u0010DR$\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010@\u001a\u0004\bI\u0010B\"\u0004\bJ\u0010DR\"\u0010\u001c\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040P8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010Q\u001a\u0004\bR\u0010SR,\u0010T\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010P8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bT\u0010Q\u001a\u0004\bU\u0010S\"\u0004\bV\u0010WR$\u00105\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b5\u0010@\u001a\u0004\bX\u0010B\"\u0004\bY\u0010D¨\u0006]"}, d2 = {"Lokhttp3/HttpUrl$Builder;", "", "", "effectivePort", "", "pathSegments", "", "alreadyEncoded", "addPathSegments", "canonicalName", "Lvz/b0;", "removeAllCanonicalQueryParameters", "input", "startPos", "limit", "resolvePath", "pos", "addTrailingSlash", "push", "isDot", "isDotDot", "pop", CardPaymentMethod.PAYMENT_METHOD_TYPE, "username", "encodedUsername", "password", "encodedPassword", "host", "port", "pathSegment", "addPathSegment", "encodedPathSegment", "addEncodedPathSegment", "encodedPathSegments", "addEncodedPathSegments", "index", "setPathSegment", "setEncodedPathSegment", "removePathSegment", "encodedPath", SearchIntents.EXTRA_QUERY, "encodedQuery", "name", "value", "addQueryParameter", "encodedName", "encodedValue", "addEncodedQueryParameter", "setQueryParameter", "setEncodedQueryParameter", "removeAllQueryParameters", "removeAllEncodedQueryParameters", "fragment", "encodedFragment", "reencodeForUri$okhttp", "()Lokhttp3/HttpUrl$Builder;", "reencodeForUri", "Lokhttp3/HttpUrl;", "build", "toString", "base", "parse$okhttp", "(Lokhttp3/HttpUrl;Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;", "parse", "Ljava/lang/String;", "getScheme$okhttp", "()Ljava/lang/String;", "setScheme$okhttp", "(Ljava/lang/String;)V", "getEncodedUsername$okhttp", "setEncodedUsername$okhttp", "getEncodedPassword$okhttp", "setEncodedPassword$okhttp", "getHost$okhttp", "setHost$okhttp", "I", "getPort$okhttp", "()I", "setPort$okhttp", "(I)V", "", "Ljava/util/List;", "getEncodedPathSegments$okhttp", "()Ljava/util/List;", "encodedQueryNamesAndValues", "getEncodedQueryNamesAndValues$okhttp", "setEncodedQueryNamesAndValues$okhttp", "(Ljava/util/List;)V", "getEncodedFragment$okhttp", "setEncodedFragment$okhttp", "<init>", "()V", "Companion", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes5.dex */
    public static final class Builder {
        public static final Companion Companion = new Companion(null);
        public static final String INVALID_HOST = "Invalid URL host";
        private String encodedFragment;
        private final List<String> encodedPathSegments;
        private List<String> encodedQueryNamesAndValues;
        private String host;
        private String scheme;
        private String encodedUsername = "";
        private String encodedPassword = "";
        private int port = -1;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u001c\u0010\b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J \u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J \u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002R\u0016\u0010\u000b\u001a\u00020\u00028\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lokhttp3/HttpUrl$Builder$Companion;", "", "", "input", "", "pos", "limit", "schemeDelimiterOffset", "slashCount", "portColonOffset", "parsePort", "INVALID_HOST", "Ljava/lang/String;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
        /* loaded from: classes5.dex */
        public static final class Companion {
            private Companion() {
            }

            public final int parsePort(String str, int i11, int i12) {
                try {
                    int parseInt = Integer.parseInt(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i11, i12, "", false, false, false, false, null, 248, null));
                    if (1 <= parseInt && 65535 >= parseInt) {
                        return parseInt;
                    }
                    return -1;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }

            public final int portColonOffset(String str, int i11, int i12) {
                while (i11 < i12) {
                    char charAt = str.charAt(i11);
                    if (charAt == ':') {
                        return i11;
                    }
                    if (charAt == '[') {
                        do {
                            i11++;
                            if (i11 < i12) {
                            }
                        } while (str.charAt(i11) != ']');
                    }
                    i11++;
                }
                return i12;
            }

            public final int schemeDelimiterOffset(String str, int i11, int i12) {
                if (i12 - i11 < 2) {
                    return -1;
                }
                char charAt = str.charAt(i11);
                if ((s.i(charAt, 97) < 0 || s.i(charAt, 122) > 0) && (s.i(charAt, 65) < 0 || s.i(charAt, 90) > 0)) {
                    return -1;
                }
                while (true) {
                    i11++;
                    if (i11 >= i12) {
                        return -1;
                    }
                    char charAt2 = str.charAt(i11);
                    if ('a' > charAt2 || 'z' < charAt2) {
                        if ('A' > charAt2 || 'Z' < charAt2) {
                            if ('0' > charAt2 || '9' < charAt2) {
                                if (charAt2 != '+' && charAt2 != '-' && charAt2 != '.') {
                                    if (charAt2 == ':') {
                                        return i11;
                                    }
                                    return -1;
                                }
                            }
                        }
                    }
                }
            }

            public final int slashCount(String str, int i11, int i12) {
                int i13 = 0;
                while (i11 < i12) {
                    char charAt = str.charAt(i11);
                    if (charAt != '\\' && charAt != '/') {
                        break;
                    }
                    i13++;
                    i11++;
                }
                return i13;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public Builder() {
            ArrayList arrayList = new ArrayList();
            this.encodedPathSegments = arrayList;
            arrayList.add("");
        }

        private final int effectivePort() {
            int i11 = this.port;
            if (i11 != -1) {
                return i11;
            }
            Companion companion = HttpUrl.Companion;
            String str = this.scheme;
            s.e(str);
            return companion.defaultPort(str);
        }

        private final boolean isDot(String str) {
            boolean u11;
            if (s.c(str, ".")) {
                return true;
            }
            u11 = v.u(str, "%2e", true);
            return u11;
        }

        private final boolean isDotDot(String str) {
            boolean u11;
            boolean u12;
            boolean u13;
            if (s.c(str, CallerDataConverter.DEFAULT_RANGE_DELIMITER)) {
                return true;
            }
            u11 = v.u(str, "%2e.", true);
            if (u11) {
                return true;
            }
            u12 = v.u(str, ".%2e", true);
            if (u12) {
                return true;
            }
            u13 = v.u(str, "%2e%2e", true);
            return u13;
        }

        private final void pop() {
            List<String> list = this.encodedPathSegments;
            if ((list.remove(list.size() - 1).length() == 0) && (!this.encodedPathSegments.isEmpty())) {
                List<String> list2 = this.encodedPathSegments;
                list2.set(list2.size() - 1, "");
                return;
            }
            this.encodedPathSegments.add("");
        }

        private final void push(String str, int i11, int i12, boolean z11, boolean z12) {
            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i11, i12, HttpUrl.PATH_SEGMENT_ENCODE_SET, z12, false, false, false, null, 240, null);
            if (isDot(canonicalize$okhttp$default)) {
                return;
            }
            if (isDotDot(canonicalize$okhttp$default)) {
                pop();
                return;
            }
            List<String> list = this.encodedPathSegments;
            if (list.get(list.size() - 1).length() == 0) {
                List<String> list2 = this.encodedPathSegments;
                list2.set(list2.size() - 1, canonicalize$okhttp$default);
            } else {
                this.encodedPathSegments.add(canonicalize$okhttp$default);
            }
            if (z11) {
                this.encodedPathSegments.add("");
            }
        }

        private final void removeAllCanonicalQueryParameters(String str) {
            g p11;
            g q11;
            List<String> list = this.encodedQueryNamesAndValues;
            s.e(list);
            p11 = l.p(list.size() - 2, 0);
            q11 = l.q(p11, 2);
            int c11 = q11.c();
            int e11 = q11.e();
            int f11 = q11.f();
            if (f11 >= 0) {
                if (c11 > e11) {
                    return;
                }
            } else if (c11 < e11) {
                return;
            }
            while (true) {
                List<String> list2 = this.encodedQueryNamesAndValues;
                s.e(list2);
                if (s.c(str, list2.get(c11))) {
                    List<String> list3 = this.encodedQueryNamesAndValues;
                    s.e(list3);
                    list3.remove(c11 + 1);
                    List<String> list4 = this.encodedQueryNamesAndValues;
                    s.e(list4);
                    list4.remove(c11);
                    List<String> list5 = this.encodedQueryNamesAndValues;
                    s.e(list5);
                    if (list5.isEmpty()) {
                        this.encodedQueryNamesAndValues = null;
                        return;
                    }
                }
                if (c11 == e11) {
                    return;
                }
                c11 += f11;
            }
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
            */
        /* JADX WARN: Removed duplicated region for block: B:37:0x002c  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0044 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0041 -> B:35:0x0029). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void resolvePath(java.lang.String r11, int r12, int r13) {
            /*
                r10 = this;
                if (r12 != r13) goto L3
                return
            L3:
                char r0 = r11.charAt(r12)
                r1 = 47
                java.lang.String r2 = ""
                r3 = 1
                if (r0 == r1) goto L1e
                r1 = 92
                if (r0 != r1) goto L13
                goto L1e
            L13:
                java.util.List<java.lang.String> r0 = r10.encodedPathSegments
                int r1 = r0.size()
                int r1 = r1 - r3
                r0.set(r1, r2)
                goto L29
            L1e:
                java.util.List<java.lang.String> r0 = r10.encodedPathSegments
                r0.clear()
                java.util.List<java.lang.String> r0 = r10.encodedPathSegments
                r0.add(r2)
                goto L41
            L29:
                r6 = r12
                if (r6 >= r13) goto L44
                java.lang.String r12 = "/\\"
                int r12 = okhttp3.internal.Util.delimiterOffset(r11, r12, r6, r13)
                if (r12 >= r13) goto L36
                r0 = r3
                goto L37
            L36:
                r0 = 0
            L37:
                r9 = 1
                r4 = r10
                r5 = r11
                r7 = r12
                r8 = r0
                r4.push(r5, r6, r7, r8, r9)
                if (r0 == 0) goto L29
            L41:
                int r12 = r12 + 1
                goto L29
            L44:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.resolvePath(java.lang.String, int, int):void");
        }

        public final Builder addEncodedPathSegment(String encodedPathSegment) {
            s.g(encodedPathSegment, "encodedPathSegment");
            push(encodedPathSegment, 0, encodedPathSegment.length(), false, true);
            return this;
        }

        public final Builder addEncodedPathSegments(String encodedPathSegments) {
            s.g(encodedPathSegments, "encodedPathSegments");
            return addPathSegments(encodedPathSegments, true);
        }

        public final Builder addEncodedQueryParameter(String encodedName, String str) {
            s.g(encodedName, "encodedName");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            s.e(list);
            Companion companion = HttpUrl.Companion;
            list.add(Companion.canonicalize$okhttp$default(companion, encodedName, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, Primes.SMALL_FACTOR_LIMIT, null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            s.e(list2);
            list2.add(str != null ? Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, Primes.SMALL_FACTOR_LIMIT, null) : null);
            return this;
        }

        public final Builder addPathSegment(String pathSegment) {
            s.g(pathSegment, "pathSegment");
            push(pathSegment, 0, pathSegment.length(), false, false);
            return this;
        }

        public final Builder addPathSegments(String pathSegments) {
            s.g(pathSegments, "pathSegments");
            return addPathSegments(pathSegments, false);
        }

        public final Builder addQueryParameter(String name, String str) {
            s.g(name, "name");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            s.e(list);
            Companion companion = HttpUrl.Companion;
            list.add(Companion.canonicalize$okhttp$default(companion, name, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            s.e(list2);
            list2.add(str != null ? Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null) : null);
            return this;
        }

        public final HttpUrl build() {
            int t11;
            ArrayList arrayList;
            int t12;
            String str = this.scheme;
            if (str != null) {
                Companion companion = HttpUrl.Companion;
                String percentDecode$okhttp$default = Companion.percentDecode$okhttp$default(companion, this.encodedUsername, 0, 0, false, 7, null);
                String percentDecode$okhttp$default2 = Companion.percentDecode$okhttp$default(companion, this.encodedPassword, 0, 0, false, 7, null);
                String str2 = this.host;
                if (str2 != null) {
                    int effectivePort = effectivePort();
                    List<String> list = this.encodedPathSegments;
                    t11 = x.t(list, 10);
                    ArrayList arrayList2 = new ArrayList(t11);
                    for (String str3 : list) {
                        arrayList2.add(Companion.percentDecode$okhttp$default(HttpUrl.Companion, str3, 0, 0, false, 7, null));
                    }
                    List<String> list2 = this.encodedQueryNamesAndValues;
                    if (list2 != null) {
                        t12 = x.t(list2, 10);
                        arrayList = new ArrayList(t12);
                        for (String str4 : list2) {
                            arrayList.add(str4 != null ? Companion.percentDecode$okhttp$default(HttpUrl.Companion, str4, 0, 0, true, 3, null) : null);
                        }
                    } else {
                        arrayList = null;
                    }
                    String str5 = this.encodedFragment;
                    return new HttpUrl(str, percentDecode$okhttp$default, percentDecode$okhttp$default2, str2, effectivePort, arrayList2, arrayList, str5 != null ? Companion.percentDecode$okhttp$default(HttpUrl.Companion, str5, 0, 0, false, 7, null) : null, toString());
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        public final Builder encodedFragment(String str) {
            this.encodedFragment = str != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, "", true, false, false, true, null, org.spongycastle.crypto.tls.CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384, null) : null;
            return this;
        }

        public final Builder encodedPassword(String encodedPassword) {
            s.g(encodedPassword, "encodedPassword");
            this.encodedPassword = Companion.canonicalize$okhttp$default(HttpUrl.Companion, encodedPassword, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null);
            return this;
        }

        public final Builder encodedPath(String encodedPath) {
            boolean H;
            s.g(encodedPath, "encodedPath");
            H = v.H(encodedPath, "/", false, 2, null);
            if (H) {
                resolvePath(encodedPath, 0, encodedPath.length());
                return this;
            }
            throw new IllegalArgumentException(("unexpected encodedPath: " + encodedPath).toString());
        }

        public final Builder encodedQuery(String str) {
            List<String> list;
            if (str != null) {
                Companion companion = HttpUrl.Companion;
                String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, null, Primes.SMALL_FACTOR_LIMIT, null);
                if (canonicalize$okhttp$default != null) {
                    list = companion.toQueryNamesAndValues$okhttp(canonicalize$okhttp$default);
                    this.encodedQueryNamesAndValues = list;
                    return this;
                }
            }
            list = null;
            this.encodedQueryNamesAndValues = list;
            return this;
        }

        public final Builder encodedUsername(String encodedUsername) {
            s.g(encodedUsername, "encodedUsername");
            this.encodedUsername = Companion.canonicalize$okhttp$default(HttpUrl.Companion, encodedUsername, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null);
            return this;
        }

        public final Builder fragment(String str) {
            this.encodedFragment = str != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, "", false, false, false, true, null, org.spongycastle.crypto.tls.CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_CBC_SHA256, null) : null;
            return this;
        }

        public final String getEncodedFragment$okhttp() {
            return this.encodedFragment;
        }

        public final String getEncodedPassword$okhttp() {
            return this.encodedPassword;
        }

        public final List<String> getEncodedPathSegments$okhttp() {
            return this.encodedPathSegments;
        }

        public final List<String> getEncodedQueryNamesAndValues$okhttp() {
            return this.encodedQueryNamesAndValues;
        }

        public final String getEncodedUsername$okhttp() {
            return this.encodedUsername;
        }

        public final String getHost$okhttp() {
            return this.host;
        }

        public final int getPort$okhttp() {
            return this.port;
        }

        public final String getScheme$okhttp() {
            return this.scheme;
        }

        public final Builder host(String host) {
            s.g(host, "host");
            String canonicalHost = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.Companion, host, 0, 0, false, 7, null));
            if (canonicalHost != null) {
                this.host = canonicalHost;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + host);
        }

        public final Builder parse$okhttp(HttpUrl httpUrl, String input) {
            int delimiterOffset;
            int i11;
            int i12;
            String str;
            boolean z11;
            int i13;
            String str2;
            int i14;
            boolean z12;
            boolean z13;
            boolean E;
            boolean E2;
            s.g(input, "input");
            int indexOfFirstNonAsciiWhitespace$default = Util.indexOfFirstNonAsciiWhitespace$default(input, 0, 0, 3, null);
            int indexOfLastNonAsciiWhitespace$default = Util.indexOfLastNonAsciiWhitespace$default(input, indexOfFirstNonAsciiWhitespace$default, 0, 2, null);
            Companion companion = Companion;
            int schemeDelimiterOffset = companion.schemeDelimiterOffset(input, indexOfFirstNonAsciiWhitespace$default, indexOfLastNonAsciiWhitespace$default);
            String str3 = "(this as java.lang.Strin…ing(startIndex, endIndex)";
            char c11 = 65535;
            boolean z14 = true;
            if (schemeDelimiterOffset != -1) {
                E = v.E(input, "https:", indexOfFirstNonAsciiWhitespace$default, true);
                if (E) {
                    this.scheme = "https";
                    indexOfFirstNonAsciiWhitespace$default += 6;
                } else {
                    E2 = v.E(input, "http:", indexOfFirstNonAsciiWhitespace$default, true);
                    if (E2) {
                        this.scheme = "http";
                        indexOfFirstNonAsciiWhitespace$default += 5;
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Expected URL scheme 'http' or 'https' but was '");
                        String substring = input.substring(0, schemeDelimiterOffset);
                        s.f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        sb2.append(substring);
                        sb2.append("'");
                        throw new IllegalArgumentException(sb2.toString());
                    }
                }
            } else if (httpUrl != null) {
                this.scheme = httpUrl.scheme();
            } else {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            int slashCount = companion.slashCount(input, indexOfFirstNonAsciiWhitespace$default, indexOfLastNonAsciiWhitespace$default);
            char c12 = '?';
            char c13 = '#';
            if (slashCount < 2 && httpUrl != null && !(!s.c(httpUrl.scheme(), this.scheme))) {
                this.encodedUsername = httpUrl.encodedUsername();
                this.encodedPassword = httpUrl.encodedPassword();
                this.host = httpUrl.host();
                this.port = httpUrl.port();
                this.encodedPathSegments.clear();
                this.encodedPathSegments.addAll(httpUrl.encodedPathSegments());
                if (indexOfFirstNonAsciiWhitespace$default == indexOfLastNonAsciiWhitespace$default || input.charAt(indexOfFirstNonAsciiWhitespace$default) == '#') {
                    encodedQuery(httpUrl.encodedQuery());
                }
                i11 = indexOfLastNonAsciiWhitespace$default;
            } else {
                int i15 = indexOfFirstNonAsciiWhitespace$default + slashCount;
                boolean z15 = false;
                boolean z16 = false;
                while (true) {
                    delimiterOffset = Util.delimiterOffset(input, "@/\\?#", i15, indexOfLastNonAsciiWhitespace$default);
                    char charAt = delimiterOffset != indexOfLastNonAsciiWhitespace$default ? input.charAt(delimiterOffset) : c11;
                    if (charAt == c11 || charAt == c13 || charAt == '/' || charAt == '\\' || charAt == c12) {
                        break;
                    }
                    if (charAt != '@') {
                        z11 = z14;
                        str2 = str3;
                        i13 = indexOfLastNonAsciiWhitespace$default;
                    } else {
                        if (!z15) {
                            int delimiterOffset2 = Util.delimiterOffset(input, (char) CoreConstants.COLON_CHAR, i15, delimiterOffset);
                            Companion companion2 = HttpUrl.Companion;
                            z11 = z14;
                            i13 = indexOfLastNonAsciiWhitespace$default;
                            String str4 = str3;
                            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion2, input, i15, delimiterOffset2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z16) {
                                canonicalize$okhttp$default = this.encodedUsername + "%40" + canonicalize$okhttp$default;
                            }
                            this.encodedUsername = canonicalize$okhttp$default;
                            if (delimiterOffset2 != delimiterOffset) {
                                this.encodedPassword = Companion.canonicalize$okhttp$default(companion2, input, delimiterOffset2 + 1, delimiterOffset, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z13 = z11;
                            } else {
                                z13 = z15;
                            }
                            z15 = z13;
                            str2 = str4;
                            z12 = z11;
                            i14 = delimiterOffset;
                        } else {
                            z11 = z14;
                            i13 = indexOfLastNonAsciiWhitespace$default;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(this.encodedPassword);
                            sb3.append("%40");
                            str2 = str3;
                            i14 = delimiterOffset;
                            sb3.append(Companion.canonicalize$okhttp$default(HttpUrl.Companion, input, i15, delimiterOffset, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
                            this.encodedPassword = sb3.toString();
                            z12 = z16;
                        }
                        i15 = i14 + 1;
                        z16 = z12;
                    }
                    str3 = str2;
                    z14 = z11;
                    indexOfLastNonAsciiWhitespace$default = i13;
                    c13 = '#';
                    c12 = '?';
                    c11 = 65535;
                }
                boolean z17 = z14;
                String str5 = str3;
                i11 = indexOfLastNonAsciiWhitespace$default;
                Companion companion3 = Companion;
                int portColonOffset = companion3.portColonOffset(input, i15, delimiterOffset);
                int i16 = portColonOffset + 1;
                if (i16 < delimiterOffset) {
                    i12 = i15;
                    this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.Companion, input, i15, portColonOffset, false, 4, null));
                    int parsePort = companion3.parsePort(input, i16, delimiterOffset);
                    this.port = parsePort;
                    if (!(parsePort != -1 ? z17 : false)) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Invalid URL port: \"");
                        String substring2 = input.substring(i16, delimiterOffset);
                        s.f(substring2, str5);
                        sb4.append(substring2);
                        sb4.append(CoreConstants.DOUBLE_QUOTE_CHAR);
                        throw new IllegalArgumentException(sb4.toString().toString());
                    }
                    str = str5;
                } else {
                    i12 = i15;
                    str = str5;
                    Companion companion4 = HttpUrl.Companion;
                    this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(companion4, input, i12, portColonOffset, false, 4, null));
                    String str6 = this.scheme;
                    s.e(str6);
                    this.port = companion4.defaultPort(str6);
                }
                if (!(this.host != null ? z17 : false)) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Invalid URL host: \"");
                    String substring3 = input.substring(i12, portColonOffset);
                    s.f(substring3, str);
                    sb5.append(substring3);
                    sb5.append(CoreConstants.DOUBLE_QUOTE_CHAR);
                    throw new IllegalArgumentException(sb5.toString().toString());
                }
                indexOfFirstNonAsciiWhitespace$default = delimiterOffset;
            }
            int i17 = i11;
            int delimiterOffset3 = Util.delimiterOffset(input, "?#", indexOfFirstNonAsciiWhitespace$default, i17);
            resolvePath(input, indexOfFirstNonAsciiWhitespace$default, delimiterOffset3);
            if (delimiterOffset3 < i17 && input.charAt(delimiterOffset3) == '?') {
                int delimiterOffset4 = Util.delimiterOffset(input, '#', delimiterOffset3, i17);
                Companion companion5 = HttpUrl.Companion;
                this.encodedQueryNamesAndValues = companion5.toQueryNamesAndValues$okhttp(Companion.canonicalize$okhttp$default(companion5, input, delimiterOffset3 + 1, delimiterOffset4, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, null, 208, null));
                delimiterOffset3 = delimiterOffset4;
            }
            if (delimiterOffset3 < i17 && input.charAt(delimiterOffset3) == '#') {
                this.encodedFragment = Companion.canonicalize$okhttp$default(HttpUrl.Companion, input, delimiterOffset3 + 1, i17, "", true, false, false, true, null, 176, null);
            }
            return this;
        }

        public final Builder password(String password) {
            s.g(password, "password");
            this.encodedPassword = Companion.canonicalize$okhttp$default(HttpUrl.Companion, password, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        public final Builder port(int i11) {
            boolean z11 = true;
            if ((1 > i11 || 65535 < i11) ? false : false) {
                this.port = i11;
                return this;
            }
            throw new IllegalArgumentException(("unexpected port: " + i11).toString());
        }

        public final Builder query(String str) {
            List<String> list;
            if (str != null) {
                Companion companion = HttpUrl.Companion;
                String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.QUERY_ENCODE_SET, false, false, true, false, null, 219, null);
                if (canonicalize$okhttp$default != null) {
                    list = companion.toQueryNamesAndValues$okhttp(canonicalize$okhttp$default);
                    this.encodedQueryNamesAndValues = list;
                    return this;
                }
            }
            list = null;
            this.encodedQueryNamesAndValues = list;
            return this;
        }

        public final Builder reencodeForUri$okhttp() {
            String str = this.host;
            this.host = str != null ? new i("[\"<>^`{|}]").i(str, "") : null;
            int size = this.encodedPathSegments.size();
            for (int i11 = 0; i11 < size; i11++) {
                List<String> list = this.encodedPathSegments;
                list.set(i11, Companion.canonicalize$okhttp$default(HttpUrl.Companion, list.get(i11), 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, true, true, false, false, null, 227, null));
            }
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    String str2 = list2.get(i12);
                    list2.set(i12, str2 != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str2, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET_URI, true, true, true, false, null, 195, null) : null);
                }
            }
            String str3 = this.encodedFragment;
            this.encodedFragment = str3 != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str3, 0, 0, HttpUrl.FRAGMENT_ENCODE_SET_URI, true, true, false, true, null, org.spongycastle.crypto.tls.CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384, null) : null;
            return this;
        }

        public final Builder removeAllEncodedQueryParameters(String encodedName) {
            s.g(encodedName, "encodedName");
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(Companion.canonicalize$okhttp$default(HttpUrl.Companion, encodedName, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, Primes.SMALL_FACTOR_LIMIT, null));
            return this;
        }

        public final Builder removeAllQueryParameters(String name) {
            s.g(name, "name");
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(Companion.canonicalize$okhttp$default(HttpUrl.Companion, name, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null));
            return this;
        }

        public final Builder removePathSegment(int i11) {
            this.encodedPathSegments.remove(i11);
            if (this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add("");
            }
            return this;
        }

        public final Builder scheme(String scheme) {
            boolean u11;
            boolean u12;
            s.g(scheme, "scheme");
            u11 = v.u(scheme, "http", true);
            if (u11) {
                this.scheme = "http";
            } else {
                u12 = v.u(scheme, "https", true);
                if (!u12) {
                    throw new IllegalArgumentException("unexpected scheme: " + scheme);
                }
                this.scheme = "https";
            }
            return this;
        }

        public final void setEncodedFragment$okhttp(String str) {
            this.encodedFragment = str;
        }

        public final void setEncodedPassword$okhttp(String str) {
            s.g(str, "<set-?>");
            this.encodedPassword = str;
        }

        public final Builder setEncodedPathSegment(int i11, String encodedPathSegment) {
            s.g(encodedPathSegment, "encodedPathSegment");
            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, encodedPathSegment, 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET, true, false, false, false, null, 243, null);
            this.encodedPathSegments.set(i11, canonicalize$okhttp$default);
            if ((isDot(canonicalize$okhttp$default) || isDotDot(canonicalize$okhttp$default)) ? false : true) {
                return this;
            }
            throw new IllegalArgumentException(("unexpected path segment: " + encodedPathSegment).toString());
        }

        public final void setEncodedQueryNamesAndValues$okhttp(List<String> list) {
            this.encodedQueryNamesAndValues = list;
        }

        public final Builder setEncodedQueryParameter(String encodedName, String str) {
            s.g(encodedName, "encodedName");
            removeAllEncodedQueryParameters(encodedName);
            addEncodedQueryParameter(encodedName, str);
            return this;
        }

        public final void setEncodedUsername$okhttp(String str) {
            s.g(str, "<set-?>");
            this.encodedUsername = str;
        }

        public final void setHost$okhttp(String str) {
            this.host = str;
        }

        public final Builder setPathSegment(int i11, String pathSegment) {
            s.g(pathSegment, "pathSegment");
            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, pathSegment, 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET, false, false, false, false, null, 251, null);
            if ((isDot(canonicalize$okhttp$default) || isDotDot(canonicalize$okhttp$default)) ? false : true) {
                this.encodedPathSegments.set(i11, canonicalize$okhttp$default);
                return this;
            }
            throw new IllegalArgumentException(("unexpected path segment: " + pathSegment).toString());
        }

        public final void setPort$okhttp(int i11) {
            this.port = i11;
        }

        public final Builder setQueryParameter(String name, String str) {
            s.g(name, "name");
            removeAllQueryParameters(name);
            addQueryParameter(name, str);
            return this;
        }

        public final void setScheme$okhttp(String str) {
            this.scheme = str;
        }

        /* JADX WARN: Code restructure failed: missing block: B:63:0x0033, code lost:
            if ((r6.encodedPassword.length() > 0) != false) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:84:0x0091, code lost:
            if (r1 != r3.defaultPort(r2)) goto L36;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String toString() {
            /*
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r6.scheme
                if (r1 == 0) goto L12
                r0.append(r1)
                java.lang.String r1 = "://"
                r0.append(r1)
                goto L17
            L12:
                java.lang.String r1 = "//"
                r0.append(r1)
            L17:
                java.lang.String r1 = r6.encodedUsername
                int r1 = r1.length()
                r2 = 1
                r3 = 0
                if (r1 <= 0) goto L23
                r1 = r2
                goto L24
            L23:
                r1 = r3
            L24:
                r4 = 58
                if (r1 != 0) goto L35
                java.lang.String r1 = r6.encodedPassword
                int r1 = r1.length()
                if (r1 <= 0) goto L32
                r1 = r2
                goto L33
            L32:
                r1 = r3
            L33:
                if (r1 == 0) goto L53
            L35:
                java.lang.String r1 = r6.encodedUsername
                r0.append(r1)
                java.lang.String r1 = r6.encodedPassword
                int r1 = r1.length()
                if (r1 <= 0) goto L43
                goto L44
            L43:
                r2 = r3
            L44:
                if (r2 == 0) goto L4e
                r0.append(r4)
                java.lang.String r1 = r6.encodedPassword
                r0.append(r1)
            L4e:
                r1 = 64
                r0.append(r1)
            L53:
                java.lang.String r1 = r6.host
                if (r1 == 0) goto L77
                kotlin.jvm.internal.s.e(r1)
                r2 = 2
                r5 = 0
                boolean r1 = kotlin.text.m.L(r1, r4, r3, r2, r5)
                if (r1 == 0) goto L72
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r6.host
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L77
            L72:
                java.lang.String r1 = r6.host
                r0.append(r1)
            L77:
                int r1 = r6.port
                r2 = -1
                if (r1 != r2) goto L80
                java.lang.String r1 = r6.scheme
                if (r1 == 0) goto L99
            L80:
                int r1 = r6.effectivePort()
                java.lang.String r2 = r6.scheme
                if (r2 == 0) goto L93
                okhttp3.HttpUrl$Companion r3 = okhttp3.HttpUrl.Companion
                kotlin.jvm.internal.s.e(r2)
                int r2 = r3.defaultPort(r2)
                if (r1 == r2) goto L99
            L93:
                r0.append(r4)
                r0.append(r1)
            L99:
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
                java.util.List<java.lang.String> r2 = r6.encodedPathSegments
                r1.toPathString$okhttp(r2, r0)
                java.util.List<java.lang.String> r2 = r6.encodedQueryNamesAndValues
                if (r2 == 0) goto Lb1
                r2 = 63
                r0.append(r2)
                java.util.List<java.lang.String> r2 = r6.encodedQueryNamesAndValues
                kotlin.jvm.internal.s.e(r2)
                r1.toQueryString$okhttp(r2, r0)
            Lb1:
                java.lang.String r1 = r6.encodedFragment
                if (r1 == 0) goto Lbf
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r6.encodedFragment
                r0.append(r1)
            Lbf:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
                kotlin.jvm.internal.s.f(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.toString():java.lang.String");
        }

        public final Builder username(String username) {
            s.g(username, "username");
            this.encodedUsername = Companion.canonicalize$okhttp$default(HttpUrl.Companion, username, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        private final Builder addPathSegments(String str, boolean z11) {
            int i11 = 0;
            do {
                int delimiterOffset = Util.delimiterOffset(str, "/\\", i11, str.length());
                push(str, i11, delimiterOffset, delimiterOffset < str.length(), z11);
                i11 = delimiterOffset + 1;
            } while (i11 <= str.length());
            return this;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0019\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bG\u0010HJ,\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002J\u001c\u0010\f\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002JV\u0010\u0014\u001a\u00020\n*\u00020\u00022\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0003H\u0007J%\u0010\u001d\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\u00030\u00172\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001f\u001a\u00020\n*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00172\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019H\u0000¢\u0006\u0004\b\u001e\u0010\u001cJ\u001b\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030 *\u00020\u0003H\u0000¢\u0006\u0004\b!\u0010\"J\u0013\u0010'\u001a\u00020$*\u00020\u0003H\u0007¢\u0006\u0004\b%\u0010&J\u0015\u0010)\u001a\u0004\u0018\u00010$*\u00020\u0003H\u0007¢\u0006\u0004\b(\u0010&J\u0015\u0010)\u001a\u0004\u0018\u00010$*\u00020*H\u0007¢\u0006\u0004\b%\u0010+J\u0015\u0010)\u001a\u0004\u0018\u00010$*\u00020,H\u0007¢\u0006\u0004\b%\u0010-J\u0017\u0010%\u001a\u00020$2\u0006\u0010.\u001a\u00020\u0003H\u0007¢\u0006\u0004\b/\u0010&J\u0019\u0010(\u001a\u0004\u0018\u00010$2\u0006\u0010.\u001a\u00020\u0003H\u0007¢\u0006\u0004\b0\u0010&J\u0019\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010.\u001a\u00020*H\u0007¢\u0006\u0004\b/\u0010+J\u0019\u0010%\u001a\u0004\u0018\u00010$2\u0006\u00101\u001a\u00020,H\u0007¢\u0006\u0004\b/\u0010-J1\u00104\u001a\u00020\u0003*\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b2\u00103Jc\u00107\u001a\u00020\u0003*\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0004\b5\u00106R\u0016\u00108\u001a\u00020\u00038\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010:\u001a\u00020\u00038\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b:\u00109R\u0016\u0010;\u001a\u00020\u00038\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b;\u00109R\u0016\u0010=\u001a\u00020<8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010?\u001a\u00020\u00038\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b?\u00109R\u0016\u0010@\u001a\u00020\u00038\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b@\u00109R\u0016\u0010A\u001a\u00020\u00038\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bA\u00109R\u0016\u0010B\u001a\u00020\u00038\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bB\u00109R\u0016\u0010C\u001a\u00020\u00038\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bC\u00109R\u0016\u0010D\u001a\u00020\u00038\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bD\u00109R\u0016\u0010E\u001a\u00020\u00038\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bE\u00109R\u0016\u0010F\u001a\u00020\u00038\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bF\u00109¨\u0006I"}, d2 = {"Lokhttp3/HttpUrl$Companion;", "", "Lokio/f;", "", "encoded", "", "pos", "limit", "", "plusIsSpace", "Lvz/b0;", "writePercentDecoded", "isPercentEncoded", "input", "encodeSet", "alreadyEncoded", "strict", "unicodeAllowed", "Ljava/nio/charset/Charset;", "charset", "writeCanonicalized", CardPaymentMethod.PAYMENT_METHOD_TYPE, "defaultPort", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "out", "toPathString$okhttp", "(Ljava/util/List;Ljava/lang/StringBuilder;)V", "toPathString", "toQueryString$okhttp", "toQueryString", "", "toQueryNamesAndValues$okhttp", "(Ljava/lang/String;)Ljava/util/List;", "toQueryNamesAndValues", "Lokhttp3/HttpUrl;", "get", "(Ljava/lang/String;)Lokhttp3/HttpUrl;", "toHttpUrl", "parse", "toHttpUrlOrNull", "Ljava/net/URL;", "(Ljava/net/URL;)Lokhttp3/HttpUrl;", "Ljava/net/URI;", "(Ljava/net/URI;)Lokhttp3/HttpUrl;", "url", "-deprecated_get", "-deprecated_parse", "uri", "percentDecode$okhttp", "(Ljava/lang/String;IIZ)Ljava/lang/String;", "percentDecode", "canonicalize$okhttp", "(Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)Ljava/lang/String;", "canonicalize", "FORM_ENCODE_SET", "Ljava/lang/String;", "FRAGMENT_ENCODE_SET", "FRAGMENT_ENCODE_SET_URI", "", "HEX_DIGITS", "[C", "PASSWORD_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET_URI", "QUERY_COMPONENT_ENCODE_SET", "QUERY_COMPONENT_ENCODE_SET_URI", "QUERY_COMPONENT_REENCODE_SET", "QUERY_ENCODE_SET", "USERNAME_ENCODE_SET", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ String canonicalize$okhttp$default(Companion companion, String str, int i11, int i12, String str2, boolean z11, boolean z12, boolean z13, boolean z14, Charset charset, int i13, Object obj) {
            return companion.canonicalize$okhttp(str, (i13 & 1) != 0 ? 0 : i11, (i13 & 2) != 0 ? str.length() : i12, str2, (i13 & 8) != 0 ? false : z11, (i13 & 16) != 0 ? false : z12, (i13 & 32) != 0 ? false : z13, (i13 & 64) != 0 ? false : z14, (i13 & 128) != 0 ? null : charset);
        }

        private final boolean isPercentEncoded(String str, int i11, int i12) {
            int i13 = i11 + 2;
            return i13 < i12 && str.charAt(i11) == '%' && Util.parseHexDigit(str.charAt(i11 + 1)) != -1 && Util.parseHexDigit(str.charAt(i13)) != -1;
        }

        public static /* synthetic */ String percentDecode$okhttp$default(Companion companion, String str, int i11, int i12, boolean z11, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i11 = 0;
            }
            if ((i13 & 2) != 0) {
                i12 = str.length();
            }
            if ((i13 & 4) != 0) {
                z11 = false;
            }
            return companion.percentDecode$okhttp(str, i11, i12, z11);
        }

        /* JADX WARN: Code restructure failed: missing block: B:97:0x0065, code lost:
            if (isPercentEncoded(r16, r5, r18) == false) goto L39;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void writeCanonicalized(okio.f r15, java.lang.String r16, int r17, int r18, java.lang.String r19, boolean r20, boolean r21, boolean r22, boolean r23, java.nio.charset.Charset r24) {
            /*
                r14 = this;
                r0 = r15
                r1 = r16
                r2 = r18
                r3 = r24
                r4 = 0
                r5 = r17
                r6 = r4
            Lb:
                if (r5 >= r2) goto Lbf
                java.lang.String r7 = "null cannot be cast to non-null type java.lang.String"
                java.util.Objects.requireNonNull(r1, r7)
                int r7 = r1.codePointAt(r5)
                if (r20 == 0) goto L2e
                r8 = 9
                if (r7 == r8) goto L29
                r8 = 10
                if (r7 == r8) goto L29
                r8 = 12
                if (r7 == r8) goto L29
                r8 = 13
                if (r7 == r8) goto L29
                goto L2e
            L29:
                r8 = r14
                r12 = r19
                goto Lb8
            L2e:
                r8 = 43
                if (r7 != r8) goto L3f
                if (r22 == 0) goto L3f
                if (r20 == 0) goto L39
                java.lang.String r8 = "+"
                goto L3b
            L39:
                java.lang.String r8 = "%2B"
            L3b:
                r15.T(r8)
                goto L29
            L3f:
                r8 = 32
                r9 = 37
                if (r7 < r8) goto L6f
                r8 = 127(0x7f, float:1.78E-43)
                if (r7 == r8) goto L6f
                r8 = 128(0x80, float:1.794E-43)
                if (r7 < r8) goto L4f
                if (r23 == 0) goto L6f
            L4f:
                char r8 = (char) r7
                r10 = 0
                r11 = 2
                r12 = r19
                boolean r8 = kotlin.text.m.L(r12, r8, r10, r11, r4)
                if (r8 != 0) goto L6d
                if (r7 != r9) goto L68
                if (r20 == 0) goto L6d
                if (r21 == 0) goto L68
                r8 = r14
                boolean r10 = r14.isPercentEncoded(r1, r5, r2)
                if (r10 != 0) goto L69
                goto L72
            L68:
                r8 = r14
            L69:
                r15.Q1(r7)
                goto Lb8
            L6d:
                r8 = r14
                goto L72
            L6f:
                r8 = r14
                r12 = r19
            L72:
                if (r6 != 0) goto L79
                okio.f r6 = new okio.f
                r6.<init>()
            L79:
                if (r3 == 0) goto L8d
                java.nio.charset.Charset r10 = java.nio.charset.StandardCharsets.UTF_8
                boolean r10 = kotlin.jvm.internal.s.c(r3, r10)
                if (r10 == 0) goto L84
                goto L8d
            L84:
                int r10 = java.lang.Character.charCount(r7)
                int r10 = r10 + r5
                r6.L1(r1, r5, r10, r3)
                goto L90
            L8d:
                r6.Q1(r7)
            L90:
                boolean r10 = r6.N0()
                if (r10 != 0) goto Lb8
                byte r10 = r6.readByte()
                r10 = r10 & 255(0xff, float:3.57E-43)
                r15.O0(r9)
                char[] r11 = okhttp3.HttpUrl.access$getHEX_DIGITS$cp()
                int r13 = r10 >> 4
                r13 = r13 & 15
                char r11 = r11[r13]
                r15.O0(r11)
                char[] r11 = okhttp3.HttpUrl.access$getHEX_DIGITS$cp()
                r10 = r10 & 15
                char r10 = r11[r10]
                r15.O0(r10)
                goto L90
            Lb8:
                int r7 = java.lang.Character.charCount(r7)
                int r5 = r5 + r7
                goto Lb
            Lbf:
                r8 = r14
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Companion.writeCanonicalized(okio.f, java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):void");
        }

        private final void writePercentDecoded(f fVar, String str, int i11, int i12, boolean z11) {
            int i13;
            while (i11 < i12) {
                Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                int codePointAt = str.codePointAt(i11);
                if (codePointAt == 37 && (i13 = i11 + 2) < i12) {
                    int parseHexDigit = Util.parseHexDigit(str.charAt(i11 + 1));
                    int parseHexDigit2 = Util.parseHexDigit(str.charAt(i13));
                    if (parseHexDigit != -1 && parseHexDigit2 != -1) {
                        fVar.O0((parseHexDigit << 4) + parseHexDigit2);
                        i11 = Character.charCount(codePointAt) + i13;
                    }
                    fVar.Q1(codePointAt);
                    i11 += Character.charCount(codePointAt);
                } else {
                    if (codePointAt == 43 && z11) {
                        fVar.O0(32);
                        i11++;
                    }
                    fVar.Q1(codePointAt);
                    i11 += Character.charCount(codePointAt);
                }
            }
        }

        /* renamed from: -deprecated_get */
        public final HttpUrl m886deprecated_get(String url) {
            s.g(url, "url");
            return get(url);
        }

        /* renamed from: -deprecated_parse */
        public final HttpUrl m889deprecated_parse(String url) {
            s.g(url, "url");
            return parse(url);
        }

        public final String canonicalize$okhttp(String canonicalize, int i11, int i12, String encodeSet, boolean z11, boolean z12, boolean z13, boolean z14, Charset charset) {
            boolean L;
            s.g(canonicalize, "$this$canonicalize");
            s.g(encodeSet, "encodeSet");
            int i13 = i11;
            while (i13 < i12) {
                int codePointAt = canonicalize.codePointAt(i13);
                if (codePointAt >= 32 && codePointAt != 127 && (codePointAt < 128 || z14)) {
                    L = w.L(encodeSet, (char) codePointAt, false, 2, null);
                    if (!L) {
                        if (codePointAt == 37) {
                            if (z11) {
                                if (z12) {
                                    if (!isPercentEncoded(canonicalize, i13, i12)) {
                                        f fVar = new f();
                                        fVar.Z(canonicalize, i11, i13);
                                        writeCanonicalized(fVar, canonicalize, i13, i12, encodeSet, z11, z12, z13, z14, charset);
                                        return fVar.G0();
                                    }
                                    if (codePointAt == 43 || !z13) {
                                        i13 += Character.charCount(codePointAt);
                                    } else {
                                        f fVar2 = new f();
                                        fVar2.Z(canonicalize, i11, i13);
                                        writeCanonicalized(fVar2, canonicalize, i13, i12, encodeSet, z11, z12, z13, z14, charset);
                                        return fVar2.G0();
                                    }
                                }
                            }
                        }
                        if (codePointAt == 43) {
                        }
                        i13 += Character.charCount(codePointAt);
                    }
                }
                f fVar22 = new f();
                fVar22.Z(canonicalize, i11, i13);
                writeCanonicalized(fVar22, canonicalize, i13, i12, encodeSet, z11, z12, z13, z14, charset);
                return fVar22.G0();
            }
            String substring = canonicalize.substring(i11, i12);
            s.f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }

        public final int defaultPort(String scheme) {
            s.g(scheme, "scheme");
            int hashCode = scheme.hashCode();
            if (hashCode != 3213448) {
                if (hashCode == 99617003 && scheme.equals("https")) {
                    return 443;
                }
            } else if (scheme.equals("http")) {
                return 80;
            }
            return -1;
        }

        public final HttpUrl get(String toHttpUrl) {
            s.g(toHttpUrl, "$this$toHttpUrl");
            return new Builder().parse$okhttp(null, toHttpUrl).build();
        }

        public final HttpUrl parse(String toHttpUrlOrNull) {
            s.g(toHttpUrlOrNull, "$this$toHttpUrlOrNull");
            try {
                return get(toHttpUrlOrNull);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public final String percentDecode$okhttp(String percentDecode, int i11, int i12, boolean z11) {
            s.g(percentDecode, "$this$percentDecode");
            for (int i13 = i11; i13 < i12; i13++) {
                char charAt = percentDecode.charAt(i13);
                if (charAt == '%' || (charAt == '+' && z11)) {
                    f fVar = new f();
                    fVar.Z(percentDecode, i11, i13);
                    writePercentDecoded(fVar, percentDecode, i13, i12, z11);
                    return fVar.G0();
                }
            }
            String substring = percentDecode.substring(i11, i12);
            s.f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }

        public final void toPathString$okhttp(List<String> toPathString, StringBuilder out) {
            s.g(toPathString, "$this$toPathString");
            s.g(out, "out");
            int size = toPathString.size();
            for (int i11 = 0; i11 < size; i11++) {
                out.append('/');
                out.append(toPathString.get(i11));
            }
        }

        public final List<String> toQueryNamesAndValues$okhttp(String toQueryNamesAndValues) {
            int Y;
            int Y2;
            s.g(toQueryNamesAndValues, "$this$toQueryNamesAndValues");
            ArrayList arrayList = new ArrayList();
            int i11 = 0;
            while (i11 <= toQueryNamesAndValues.length()) {
                Y = w.Y(toQueryNamesAndValues, '&', i11, false, 4, null);
                if (Y == -1) {
                    Y = toQueryNamesAndValues.length();
                }
                int i12 = Y;
                Y2 = w.Y(toQueryNamesAndValues, '=', i11, false, 4, null);
                if (Y2 != -1 && Y2 <= i12) {
                    String substring = toQueryNamesAndValues.substring(i11, Y2);
                    s.f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring);
                    String substring2 = toQueryNamesAndValues.substring(Y2 + 1, i12);
                    s.f(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring2);
                } else {
                    String substring3 = toQueryNamesAndValues.substring(i11, i12);
                    s.f(substring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring3);
                    arrayList.add(null);
                }
                i11 = i12 + 1;
            }
            return arrayList;
        }

        public final void toQueryString$okhttp(List<String> toQueryString, StringBuilder out) {
            m00.i r11;
            g q11;
            s.g(toQueryString, "$this$toQueryString");
            s.g(out, "out");
            r11 = l.r(0, toQueryString.size());
            q11 = l.q(r11, 2);
            int c11 = q11.c();
            int e11 = q11.e();
            int f11 = q11.f();
            if (f11 >= 0) {
                if (c11 > e11) {
                    return;
                }
            } else if (c11 < e11) {
                return;
            }
            while (true) {
                String str = toQueryString.get(c11);
                String str2 = toQueryString.get(c11 + 1);
                if (c11 > 0) {
                    out.append('&');
                }
                out.append(str);
                if (str2 != null) {
                    out.append('=');
                    out.append(str2);
                }
                if (c11 == e11) {
                    return;
                }
                c11 += f11;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: -deprecated_get */
        public final HttpUrl m888deprecated_get(URL url) {
            s.g(url, "url");
            return get(url);
        }

        public final HttpUrl get(URL toHttpUrlOrNull) {
            s.g(toHttpUrlOrNull, "$this$toHttpUrlOrNull");
            String url = toHttpUrlOrNull.toString();
            s.f(url, "toString()");
            return parse(url);
        }

        /* renamed from: -deprecated_get */
        public final HttpUrl m887deprecated_get(URI uri) {
            s.g(uri, "uri");
            return get(uri);
        }

        public final HttpUrl get(URI toHttpUrlOrNull) {
            s.g(toHttpUrlOrNull, "$this$toHttpUrlOrNull");
            String uri = toHttpUrlOrNull.toString();
            s.f(uri, "toString()");
            return parse(uri);
        }
    }

    public HttpUrl(String scheme, String username, String password, String host, int i11, List<String> pathSegments, List<String> list, String str, String url) {
        s.g(scheme, "scheme");
        s.g(username, "username");
        s.g(password, "password");
        s.g(host, "host");
        s.g(pathSegments, "pathSegments");
        s.g(url, "url");
        this.scheme = scheme;
        this.username = username;
        this.password = password;
        this.host = host;
        this.port = i11;
        this.pathSegments = pathSegments;
        this.queryNamesAndValues = list;
        this.fragment = str;
        this.url = url;
        this.isHttps = s.c(scheme, "https");
    }

    public static final int defaultPort(String str) {
        return Companion.defaultPort(str);
    }

    public static final HttpUrl get(String str) {
        return Companion.get(str);
    }

    public static final HttpUrl get(URI uri) {
        return Companion.get(uri);
    }

    public static final HttpUrl get(URL url) {
        return Companion.get(url);
    }

    public static final HttpUrl parse(String str) {
        return Companion.parse(str);
    }

    /* renamed from: -deprecated_encodedFragment */
    public final String m867deprecated_encodedFragment() {
        return encodedFragment();
    }

    /* renamed from: -deprecated_encodedPassword */
    public final String m868deprecated_encodedPassword() {
        return encodedPassword();
    }

    /* renamed from: -deprecated_encodedPath */
    public final String m869deprecated_encodedPath() {
        return encodedPath();
    }

    /* renamed from: -deprecated_encodedPathSegments */
    public final List<String> m870deprecated_encodedPathSegments() {
        return encodedPathSegments();
    }

    /* renamed from: -deprecated_encodedQuery */
    public final String m871deprecated_encodedQuery() {
        return encodedQuery();
    }

    /* renamed from: -deprecated_encodedUsername */
    public final String m872deprecated_encodedUsername() {
        return encodedUsername();
    }

    /* renamed from: -deprecated_fragment */
    public final String m873deprecated_fragment() {
        return this.fragment;
    }

    /* renamed from: -deprecated_host */
    public final String m874deprecated_host() {
        return this.host;
    }

    /* renamed from: -deprecated_password */
    public final String m875deprecated_password() {
        return this.password;
    }

    /* renamed from: -deprecated_pathSegments */
    public final List<String> m876deprecated_pathSegments() {
        return this.pathSegments;
    }

    /* renamed from: -deprecated_pathSize */
    public final int m877deprecated_pathSize() {
        return pathSize();
    }

    /* renamed from: -deprecated_port */
    public final int m878deprecated_port() {
        return this.port;
    }

    /* renamed from: -deprecated_query */
    public final String m879deprecated_query() {
        return query();
    }

    /* renamed from: -deprecated_queryParameterNames */
    public final Set<String> m880deprecated_queryParameterNames() {
        return queryParameterNames();
    }

    /* renamed from: -deprecated_querySize */
    public final int m881deprecated_querySize() {
        return querySize();
    }

    /* renamed from: -deprecated_scheme */
    public final String m882deprecated_scheme() {
        return this.scheme;
    }

    /* renamed from: -deprecated_uri */
    public final URI m883deprecated_uri() {
        return uri();
    }

    /* renamed from: -deprecated_url */
    public final URL m884deprecated_url() {
        return url();
    }

    /* renamed from: -deprecated_username */
    public final String m885deprecated_username() {
        return this.username;
    }

    public final String encodedFragment() {
        int Y;
        if (this.fragment == null) {
            return null;
        }
        Y = w.Y(this.url, '#', 0, false, 6, null);
        String str = this.url;
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(Y + 1);
        s.f(substring, "(this as java.lang.String).substring(startIndex)");
        return substring;
    }

    public final String encodedPassword() {
        int Y;
        int Y2;
        if (this.password.length() == 0) {
            return "";
        }
        Y = w.Y(this.url, CoreConstants.COLON_CHAR, this.scheme.length() + 3, false, 4, null);
        Y2 = w.Y(this.url, '@', 0, false, 6, null);
        String str = this.url;
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(Y + 1, Y2);
        s.f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public final String encodedPath() {
        int Y;
        Y = w.Y(this.url, '/', this.scheme.length() + 3, false, 4, null);
        String str = this.url;
        int delimiterOffset = Util.delimiterOffset(str, "?#", Y, str.length());
        String str2 = this.url;
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        String substring = str2.substring(Y, delimiterOffset);
        s.f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public final List<String> encodedPathSegments() {
        int Y;
        Y = w.Y(this.url, '/', this.scheme.length() + 3, false, 4, null);
        String str = this.url;
        int delimiterOffset = Util.delimiterOffset(str, "?#", Y, str.length());
        ArrayList arrayList = new ArrayList();
        while (Y < delimiterOffset) {
            int i11 = Y + 1;
            int delimiterOffset2 = Util.delimiterOffset(this.url, '/', i11, delimiterOffset);
            String str2 = this.url;
            Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
            String substring = str2.substring(i11, delimiterOffset2);
            s.f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            arrayList.add(substring);
            Y = delimiterOffset2;
        }
        return arrayList;
    }

    public final String encodedQuery() {
        int Y;
        if (this.queryNamesAndValues == null) {
            return null;
        }
        Y = w.Y(this.url, '?', 0, false, 6, null);
        int i11 = Y + 1;
        String str = this.url;
        int delimiterOffset = Util.delimiterOffset(str, '#', i11, str.length());
        String str2 = this.url;
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        String substring = str2.substring(i11, delimiterOffset);
        s.f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public final String encodedUsername() {
        if (this.username.length() == 0) {
            return "";
        }
        int length = this.scheme.length() + 3;
        String str = this.url;
        int delimiterOffset = Util.delimiterOffset(str, ":@", length, str.length());
        String str2 = this.url;
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        String substring = str2.substring(length, delimiterOffset);
        s.f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public boolean equals(Object obj) {
        return (obj instanceof HttpUrl) && s.c(((HttpUrl) obj).url, this.url);
    }

    public final String fragment() {
        return this.fragment;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    public final String host() {
        return this.host;
    }

    public final boolean isHttps() {
        return this.isHttps;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.setScheme$okhttp(this.scheme);
        builder.setEncodedUsername$okhttp(encodedUsername());
        builder.setEncodedPassword$okhttp(encodedPassword());
        builder.setHost$okhttp(this.host);
        builder.setPort$okhttp(this.port != Companion.defaultPort(this.scheme) ? this.port : -1);
        builder.getEncodedPathSegments$okhttp().clear();
        builder.getEncodedPathSegments$okhttp().addAll(encodedPathSegments());
        builder.encodedQuery(encodedQuery());
        builder.setEncodedFragment$okhttp(encodedFragment());
        return builder;
    }

    public final String password() {
        return this.password;
    }

    public final List<String> pathSegments() {
        return this.pathSegments;
    }

    public final int pathSize() {
        return this.pathSegments.size();
    }

    public final int port() {
        return this.port;
    }

    public final String query() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        Companion.toQueryString$okhttp(this.queryNamesAndValues, sb2);
        return sb2.toString();
    }

    public final String queryParameter(String name) {
        m00.i r11;
        g q11;
        s.g(name, "name");
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            return null;
        }
        r11 = l.r(0, list.size());
        q11 = l.q(r11, 2);
        int c11 = q11.c();
        int e11 = q11.e();
        int f11 = q11.f();
        if (f11 < 0 ? c11 >= e11 : c11 <= e11) {
            while (!s.c(name, this.queryNamesAndValues.get(c11))) {
                if (c11 != e11) {
                    c11 += f11;
                }
            }
            return this.queryNamesAndValues.get(c11 + 1);
        }
        return null;
    }

    public final String queryParameterName(int i11) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            String str = list.get(i11 * 2);
            s.e(str);
            return str;
        }
        throw new IndexOutOfBoundsException();
    }

    public final Set<String> queryParameterNames() {
        m00.i r11;
        g q11;
        Set<String> d11;
        if (this.queryNamesAndValues == null) {
            d11 = x0.d();
            return d11;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        r11 = l.r(0, this.queryNamesAndValues.size());
        q11 = l.q(r11, 2);
        int c11 = q11.c();
        int e11 = q11.e();
        int f11 = q11.f();
        if (f11 < 0 ? c11 >= e11 : c11 <= e11) {
            while (true) {
                String str = this.queryNamesAndValues.get(c11);
                s.e(str);
                linkedHashSet.add(str);
                if (c11 == e11) {
                    break;
                }
                c11 += f11;
            }
        }
        Set<String> unmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        s.f(unmodifiableSet, "Collections.unmodifiableSet(result)");
        return unmodifiableSet;
    }

    public final String queryParameterValue(int i11) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.get((i11 * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    public final List<String> queryParameterValues(String name) {
        m00.i r11;
        g q11;
        List<String> i11;
        s.g(name, "name");
        if (this.queryNamesAndValues == null) {
            i11 = wz.w.i();
            return i11;
        }
        ArrayList arrayList = new ArrayList();
        r11 = l.r(0, this.queryNamesAndValues.size());
        q11 = l.q(r11, 2);
        int c11 = q11.c();
        int e11 = q11.e();
        int f11 = q11.f();
        if (f11 < 0 ? c11 >= e11 : c11 <= e11) {
            while (true) {
                if (s.c(name, this.queryNamesAndValues.get(c11))) {
                    arrayList.add(this.queryNamesAndValues.get(c11 + 1));
                }
                if (c11 == e11) {
                    break;
                }
                c11 += f11;
            }
        }
        List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
        s.f(unmodifiableList, "Collections.unmodifiableList(result)");
        return unmodifiableList;
    }

    public final int querySize() {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    public final String redact() {
        Builder newBuilder = newBuilder("/...");
        s.e(newBuilder);
        return newBuilder.username("").password("").build().toString();
    }

    public final HttpUrl resolve(String link) {
        s.g(link, "link");
        Builder newBuilder = newBuilder(link);
        if (newBuilder != null) {
            return newBuilder.build();
        }
        return null;
    }

    public final String scheme() {
        return this.scheme;
    }

    public String toString() {
        return this.url;
    }

    public final String topPrivateDomain() {
        if (Util.canParseAsIpAddress(this.host)) {
            return null;
        }
        return PublicSuffixDatabase.Companion.get().getEffectiveTldPlusOne(this.host);
    }

    public final URI uri() {
        String builder = newBuilder().reencodeForUri$okhttp().toString();
        try {
            return new URI(builder);
        } catch (URISyntaxException e11) {
            try {
                URI create = URI.create(new i("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").i(builder, ""));
                s.f(create, "try {\n        val stripp…e) // Unexpected!\n      }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e11);
            }
        }
    }

    public final URL url() {
        try {
            return new URL(this.url);
        } catch (MalformedURLException e11) {
            throw new RuntimeException(e11);
        }
    }

    public final String username() {
        return this.username;
    }

    public final Builder newBuilder(String link) {
        s.g(link, "link");
        try {
            return new Builder().parse$okhttp(this, link);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}