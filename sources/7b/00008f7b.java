package okhttp3.internal.ws;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.text.u;
import kotlin.text.v;
import kotlin.text.w;
import okhttp3.Headers;
import okhttp3.internal.Util;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eBG\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\u0012\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\n\u0010\bJ\t\u0010\u000b\u001a\u00020\u0002HÆ\u0003J\t\u0010\f\u001a\u00020\u0002HÆ\u0003JP\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0016\u0010\r\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001aR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001bR\u0016\u0010\u000f\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001aR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001bR\u0016\u0010\u0011\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001aR\u0016\u0010\u0012\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001a¨\u0006\u001f"}, d2 = {"Lokhttp3/internal/ws/WebSocketExtensions;", "", "", "clientOriginated", "noContextTakeover", "component1", "", "component2", "()Ljava/lang/Integer;", "component3", "component4", "component5", "component6", "perMessageDeflate", "clientMaxWindowBits", "clientNoContextTakeover", "serverMaxWindowBits", "serverNoContextTakeover", "unknownValues", "copy", "(ZLjava/lang/Integer;ZLjava/lang/Integer;ZZ)Lokhttp3/internal/ws/WebSocketExtensions;", "", "toString", "hashCode", "other", "equals", "Z", "Ljava/lang/Integer;", "<init>", "(ZLjava/lang/Integer;ZLjava/lang/Integer;ZZ)V", "Companion", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class WebSocketExtensions {
    public static final Companion Companion = new Companion(null);
    private static final String HEADER_WEB_SOCKET_EXTENSION = "Sec-WebSocket-Extensions";
    public final Integer clientMaxWindowBits;
    public final boolean clientNoContextTakeover;
    public final boolean perMessageDeflate;
    public final Integer serverMaxWindowBits;
    public final boolean serverNoContextTakeover;
    public final boolean unknownValues;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lokhttp3/internal/ws/WebSocketExtensions$Companion;", "", "Lokhttp3/Headers;", "responseHeaders", "Lokhttp3/internal/ws/WebSocketExtensions;", "parse", "", "HEADER_WEB_SOCKET_EXTENSION", "Ljava/lang/String;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public final WebSocketExtensions parse(Headers responseHeaders) {
            boolean u11;
            boolean u12;
            boolean u13;
            boolean u14;
            boolean u15;
            boolean u16;
            Integer n11;
            Integer n12;
            s.g(responseHeaders, "responseHeaders");
            int size = responseHeaders.size();
            boolean z11 = false;
            Integer num = null;
            boolean z12 = false;
            Integer num2 = null;
            boolean z13 = false;
            boolean z14 = false;
            for (int i11 = 0; i11 < size; i11++) {
                u11 = v.u(responseHeaders.name(i11), WebSocketExtensions.HEADER_WEB_SOCKET_EXTENSION, true);
                if (u11) {
                    String value = responseHeaders.value(i11);
                    int i12 = 0;
                    while (i12 < value.length()) {
                        int delimiterOffset$default = Util.delimiterOffset$default(value, (char) CoreConstants.COMMA_CHAR, i12, 0, 4, (Object) null);
                        int delimiterOffset = Util.delimiterOffset(value, ';', i12, delimiterOffset$default);
                        String trimSubstring = Util.trimSubstring(value, i12, delimiterOffset);
                        int i13 = delimiterOffset + 1;
                        u12 = v.u(trimSubstring, "permessage-deflate", true);
                        if (u12) {
                            if (z11) {
                                z14 = true;
                            }
                            while (i13 < delimiterOffset$default) {
                                int delimiterOffset2 = Util.delimiterOffset(value, ';', i13, delimiterOffset$default);
                                int delimiterOffset3 = Util.delimiterOffset(value, '=', i13, delimiterOffset2);
                                String trimSubstring2 = Util.trimSubstring(value, i13, delimiterOffset3);
                                String w02 = delimiterOffset3 < delimiterOffset2 ? w.w0(Util.trimSubstring(value, delimiterOffset3 + 1, delimiterOffset2), "\"") : null;
                                int i14 = delimiterOffset2 + 1;
                                u13 = v.u(trimSubstring2, "client_max_window_bits", true);
                                if (u13) {
                                    if (num != null) {
                                        z14 = true;
                                    }
                                    if (w02 != null) {
                                        n12 = u.n(w02);
                                        num = n12;
                                    } else {
                                        num = null;
                                    }
                                    if (num != null) {
                                        i13 = i14;
                                    }
                                    z14 = true;
                                    i13 = i14;
                                } else {
                                    u14 = v.u(trimSubstring2, "client_no_context_takeover", true);
                                    if (u14) {
                                        if (z12) {
                                            z14 = true;
                                        }
                                        if (w02 != null) {
                                            z14 = true;
                                        }
                                        z12 = true;
                                    } else {
                                        u15 = v.u(trimSubstring2, "server_max_window_bits", true);
                                        if (u15) {
                                            if (num2 != null) {
                                                z14 = true;
                                            }
                                            if (w02 != null) {
                                                n11 = u.n(w02);
                                                num2 = n11;
                                            } else {
                                                num2 = null;
                                            }
                                            if (num2 != null) {
                                            }
                                            z14 = true;
                                        } else {
                                            u16 = v.u(trimSubstring2, "server_no_context_takeover", true);
                                            if (u16) {
                                                if (z13) {
                                                    z14 = true;
                                                }
                                                if (w02 != null) {
                                                    z14 = true;
                                                }
                                                z13 = true;
                                            }
                                            z14 = true;
                                        }
                                    }
                                    i13 = i14;
                                }
                            }
                            i12 = i13;
                            z11 = true;
                        } else {
                            i12 = i13;
                            z14 = true;
                        }
                    }
                }
            }
            return new WebSocketExtensions(z11, num, z12, num2, z13, z14);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public WebSocketExtensions() {
        this(false, null, false, null, false, false, 63, null);
    }

    public WebSocketExtensions(boolean z11, Integer num, boolean z12, Integer num2, boolean z13, boolean z14) {
        this.perMessageDeflate = z11;
        this.clientMaxWindowBits = num;
        this.clientNoContextTakeover = z12;
        this.serverMaxWindowBits = num2;
        this.serverNoContextTakeover = z13;
        this.unknownValues = z14;
    }

    public static /* synthetic */ WebSocketExtensions copy$default(WebSocketExtensions webSocketExtensions, boolean z11, Integer num, boolean z12, Integer num2, boolean z13, boolean z14, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = webSocketExtensions.perMessageDeflate;
        }
        if ((i11 & 2) != 0) {
            num = webSocketExtensions.clientMaxWindowBits;
        }
        Integer num3 = num;
        if ((i11 & 4) != 0) {
            z12 = webSocketExtensions.clientNoContextTakeover;
        }
        boolean z15 = z12;
        if ((i11 & 8) != 0) {
            num2 = webSocketExtensions.serverMaxWindowBits;
        }
        Integer num4 = num2;
        if ((i11 & 16) != 0) {
            z13 = webSocketExtensions.serverNoContextTakeover;
        }
        boolean z16 = z13;
        if ((i11 & 32) != 0) {
            z14 = webSocketExtensions.unknownValues;
        }
        return webSocketExtensions.copy(z11, num3, z15, num4, z16, z14);
    }

    public final boolean component1() {
        return this.perMessageDeflate;
    }

    public final Integer component2() {
        return this.clientMaxWindowBits;
    }

    public final boolean component3() {
        return this.clientNoContextTakeover;
    }

    public final Integer component4() {
        return this.serverMaxWindowBits;
    }

    public final boolean component5() {
        return this.serverNoContextTakeover;
    }

    public final boolean component6() {
        return this.unknownValues;
    }

    public final WebSocketExtensions copy(boolean z11, Integer num, boolean z12, Integer num2, boolean z13, boolean z14) {
        return new WebSocketExtensions(z11, num, z12, num2, z13, z14);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WebSocketExtensions) {
                WebSocketExtensions webSocketExtensions = (WebSocketExtensions) obj;
                return this.perMessageDeflate == webSocketExtensions.perMessageDeflate && s.c(this.clientMaxWindowBits, webSocketExtensions.clientMaxWindowBits) && this.clientNoContextTakeover == webSocketExtensions.clientNoContextTakeover && s.c(this.serverMaxWindowBits, webSocketExtensions.serverMaxWindowBits) && this.serverNoContextTakeover == webSocketExtensions.serverNoContextTakeover && this.unknownValues == webSocketExtensions.unknownValues;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    public int hashCode() {
        boolean z11 = this.perMessageDeflate;
        ?? r02 = z11;
        if (z11) {
            r02 = 1;
        }
        int i11 = r02 * 31;
        Integer num = this.clientMaxWindowBits;
        int hashCode = (i11 + (num != null ? num.hashCode() : 0)) * 31;
        ?? r22 = this.clientNoContextTakeover;
        int i12 = r22;
        if (r22 != 0) {
            i12 = 1;
        }
        int i13 = (hashCode + i12) * 31;
        Integer num2 = this.serverMaxWindowBits;
        int hashCode2 = (i13 + (num2 != null ? num2.hashCode() : 0)) * 31;
        ?? r23 = this.serverNoContextTakeover;
        int i14 = r23;
        if (r23 != 0) {
            i14 = 1;
        }
        int i15 = (hashCode2 + i14) * 31;
        boolean z12 = this.unknownValues;
        return i15 + (z12 ? 1 : z12 ? 1 : 0);
    }

    public final boolean noContextTakeover(boolean z11) {
        if (z11) {
            return this.clientNoContextTakeover;
        }
        return this.serverNoContextTakeover;
    }

    public String toString() {
        return "WebSocketExtensions(perMessageDeflate=" + this.perMessageDeflate + ", clientMaxWindowBits=" + this.clientMaxWindowBits + ", clientNoContextTakeover=" + this.clientNoContextTakeover + ", serverMaxWindowBits=" + this.serverMaxWindowBits + ", serverNoContextTakeover=" + this.serverNoContextTakeover + ", unknownValues=" + this.unknownValues + ")";
    }

    public /* synthetic */ WebSocketExtensions(boolean z11, Integer num, boolean z12, Integer num2, boolean z13, boolean z14, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? null : num, (i11 & 4) != 0 ? false : z12, (i11 & 8) == 0 ? num2 : null, (i11 & 16) != 0 ? false : z13, (i11 & 32) != 0 ? false : z14);
    }
}