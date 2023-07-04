package expo.modules.crypto;

import android.content.Context;
import android.util.Base64;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.BaseJavaModule;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import expo.modules.core.ExportedModule;
import expo.modules.core.Promise;
import expo.modules.core.interfaces.ExpoMethod;
import expo.modules.imagepicker.ImagePickerConstants;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import kotlin.text.d;
import wz.p;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J6\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¨\u0006\u0011"}, d2 = {"Lexpo/modules/crypto/CryptoModule;", "Lexpo/modules/core/ExportedModule;", "", "getName", "algorithm", MessageExtension.FIELD_DATA, "", "", "options", "Lexpo/modules/core/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lvz/b0;", "digestStringAsync", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "expo-crypto_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class CryptoModule extends ExportedModule {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoModule(Context context) {
        super(context);
        s.g(context, "context");
    }

    @ExpoMethod
    public final void digestStringAsync(String algorithm, String data, Map<String, ? extends Object> options, Promise promise) {
        String W;
        s.g(algorithm, "algorithm");
        s.g(data, "data");
        s.g(options, "options");
        s.g(promise, "promise");
        String str = (String) options.get("encoding");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
            byte[] bytes = data.getBytes(d.f35187b);
            s.f(bytes, "this as java.lang.String).getBytes(charset)");
            messageDigest.update(bytes);
            byte[] digest = messageDigest.digest();
            s.f(digest, "messageDigest.digest()");
            if (s.c(str, ImagePickerConstants.OPTION_BASE64)) {
                promise.resolve(Base64.encodeToString(digest, 2));
            } else if (s.c(str, "hex")) {
                W = p.W(digest, "", null, null, 0, null, CryptoModule$digestStringAsync$output$1.INSTANCE, 30, null);
                promise.resolve(W);
            } else {
                promise.reject("ERR_CRYPTO_DIGEST", "Invalid encoding type provided.");
            }
        } catch (NoSuchAlgorithmException e11) {
            promise.reject("ERR_CRYPTO_DIGEST", e11);
        }
    }

    @Override // expo.modules.core.ExportedModule
    public String getName() {
        return "ExpoCrypto";
    }
}