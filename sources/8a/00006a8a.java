package expo.modules.kotlin.exception;

import h00.a;
import h00.l;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, d2 = {"T", "Lkotlin/Function1;", "Lexpo/modules/kotlin/exception/CodedException;", "", "decoratorBlock", "Lkotlin/Function0;", "block", "exceptionDecorator", "(Lh00/l;Lh00/a;)Ljava/lang/Object;", "expo-modules-core_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class ExceptionDecoratorKt {
    public static final <T> T exceptionDecorator(l<? super CodedException, ? extends Throwable> decoratorBlock, a<? extends T> block) {
        s.g(decoratorBlock, "decoratorBlock");
        s.g(block, "block");
        try {
            return block.invoke();
        } catch (CodedException e11) {
            throw decoratorBlock.invoke(e11);
        } catch (Throwable th2) {
            throw decoratorBlock.invoke(new UnexpectedException(th2));
        }
    }
}