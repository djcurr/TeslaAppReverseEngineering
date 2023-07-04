package expo.modules.kotlin.exception;

import com.stripe.android.model.PaymentMethodOptionsParams;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.text.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\t\b\u0016\u0018\u0000 \u00122\u00060\u0001j\u0002`\u0002:\u0001\u0012B\u001b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB%\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\u000eB\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\u000fB\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\u0010B\t\b\u0016¢\u0006\u0004\b\f\u0010\u0011R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0013\u0010\b\u001a\u00020\u00038F@\u0006¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lexpo/modules/kotlin/exception/CodedException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "providedCode", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", PaymentMethodOptionsParams.Blik.PARAM_CODE, "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "(Ljava/lang/String;)V", "(Ljava/lang/Throwable;)V", "()V", "Companion", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public class CodedException extends Exception {
    public static final Companion Companion = new Companion(null);
    private String providedCode;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0001¨\u0006\b"}, d2 = {"Lexpo/modules/kotlin/exception/CodedException$Companion;", "", "Ljava/lang/Class;", "clazz", "", "inferCode", "<init>", "()V", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String inferCode(Class<?> clazz) {
            s.g(clazz, "clazz");
            String i11 = new i("(.)([A-Z])").i(new i("(Exception)$").i(clazz.getSimpleName(), ""), "$1_$2");
            Locale ROOT = Locale.ROOT;
            s.f(ROOT, "ROOT");
            String upperCase = i11.toUpperCase(ROOT);
            s.f(upperCase, "this as java.lang.String).toUpperCase(locale)");
            return "ERR_" + upperCase;
        }
    }

    public CodedException(String str, Throwable th2) {
        super(str, th2);
    }

    public final String getCode() {
        String str = this.providedCode;
        return str == null ? Companion.inferCode(getClass()) : str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CodedException(String code, String str, Throwable th2) {
        this(str, th2);
        s.g(code, "code");
        this.providedCode = code;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CodedException(String message) {
        this(message, null);
        s.g(message, "message");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CodedException(Throwable cause) {
        this(cause.getLocalizedMessage(), cause);
        s.g(cause, "cause");
    }

    public CodedException() {
        this(null, null);
    }
}