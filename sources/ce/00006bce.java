package expo.modules.random;

import h00.a;
import java.security.SecureRandom;
import kotlin.Metadata;
import kotlin.jvm.internal.u;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Ljava/security/SecureRandom;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes5.dex */
final class RandomModule$secureRandom$2 extends u implements a<SecureRandom> {
    public static final RandomModule$secureRandom$2 INSTANCE = new RandomModule$secureRandom$2();

    RandomModule$secureRandom$2() {
        super(0);
    }

    @Override // h00.a
    public final SecureRandom invoke() {
        return new SecureRandom();
    }
}