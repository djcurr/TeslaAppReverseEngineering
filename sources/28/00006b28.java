package expo.modules.kotlin.types;

import h00.a;
import kotlin.Metadata;
import kotlin.jvm.internal.u;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n"}, d2 = {"Lexpo/modules/kotlin/types/TypeConverter;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes5.dex */
final class AnyType$converter$2 extends u implements a<TypeConverter<?>> {
    final /* synthetic */ AnyType this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnyType$converter$2(AnyType anyType) {
        super(0);
        this.this$0 = anyType;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final TypeConverter<?> invoke() {
        return TypeConverterProviderImpl.INSTANCE.obtainTypeConverter(this.this$0.getKType());
    }
}