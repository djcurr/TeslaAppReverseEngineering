package expo.modules.kotlin.functions;

import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeKt;
import h00.l;
import h00.p;
import h00.q;
import h00.r;
import h00.t;
import h00.u;
import h00.v;
import h00.w;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import zz.d;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\u0007\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00012\u001e\b\u0004\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0087\fø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001aM\u0010\u0007\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\t\u0018\u0001*\u00020\u00012$\b\u0004\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\nH\u0087\fø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u000b\u001a[\u0010\u0007\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\t\u0018\u0001\"\u0006\b\u0002\u0010\f\u0018\u0001*\u00020\u00012*\b\u0004\u0010\u0005\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\rH\u0087\fø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u000e\u001ai\u0010\u0007\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\t\u0018\u0001\"\u0006\b\u0002\u0010\f\u0018\u0001\"\u0006\b\u0003\u0010\u000f\u0018\u0001*\u00020\u000120\b\u0004\u0010\u0005\u001a*\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0010H\u0087\fø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0011\u001aw\u0010\u0007\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\t\u0018\u0001\"\u0006\b\u0002\u0010\f\u0018\u0001\"\u0006\b\u0003\u0010\u000f\u0018\u0001\"\u0006\b\u0004\u0010\u0012\u0018\u0001*\u00020\u000126\b\u0004\u0010\u0005\u001a0\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0013H\u0087\fø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0014\u001a\u0085\u0001\u0010\u0007\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\t\u0018\u0001\"\u0006\b\u0002\u0010\f\u0018\u0001\"\u0006\b\u0003\u0010\u000f\u0018\u0001\"\u0006\b\u0004\u0010\u0012\u0018\u0001\"\u0006\b\u0005\u0010\u0015\u0018\u0001*\u00020\u00012<\b\u0004\u0010\u0005\u001a6\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0016H\u0087\fø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0017\u001a\u0093\u0001\u0010\u0007\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\t\u0018\u0001\"\u0006\b\u0002\u0010\f\u0018\u0001\"\u0006\b\u0003\u0010\u000f\u0018\u0001\"\u0006\b\u0004\u0010\u0012\u0018\u0001\"\u0006\b\u0005\u0010\u0015\u0018\u0001\"\u0006\b\u0006\u0010\u0018\u0018\u0001*\u00020\u00012B\b\u0004\u0010\u0005\u001a<\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0019H\u0087\fø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u001a\u001a¡\u0001\u0010\u0007\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\t\u0018\u0001\"\u0006\b\u0002\u0010\f\u0018\u0001\"\u0006\b\u0003\u0010\u000f\u0018\u0001\"\u0006\b\u0004\u0010\u0012\u0018\u0001\"\u0006\b\u0005\u0010\u0015\u0018\u0001\"\u0006\b\u0006\u0010\u0018\u0018\u0001\"\u0006\b\u0007\u0010\u001b\u0018\u0001*\u00020\u00012H\b\u0004\u0010\u0005\u001aB\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u001cH\u0087\fø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u001d\u001a¯\u0001\u0010\u0007\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\t\u0018\u0001\"\u0006\b\u0002\u0010\f\u0018\u0001\"\u0006\b\u0003\u0010\u000f\u0018\u0001\"\u0006\b\u0004\u0010\u0012\u0018\u0001\"\u0006\b\u0005\u0010\u0015\u0018\u0001\"\u0006\b\u0006\u0010\u0018\u0018\u0001\"\u0006\b\u0007\u0010\u001b\u0018\u0001\"\u0006\b\b\u0010\u001e\u0018\u0001*\u00020\u00012N\b\u0004\u0010\u0005\u001aH\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u001fH\u0087\fø\u0001\u0000¢\u0006\u0004\b\u0007\u0010 \u001a?\u0010!\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00012\u001e\b\u0004\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0086\fø\u0001\u0000¢\u0006\u0004\b!\u0010\b\u001aM\u0010!\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\t\u0018\u0001*\u00020\u00012$\b\u0004\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\nH\u0086\fø\u0001\u0000¢\u0006\u0004\b!\u0010\u000b\u001a[\u0010!\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\t\u0018\u0001\"\u0006\b\u0002\u0010\f\u0018\u0001*\u00020\u00012*\b\u0004\u0010\u0005\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\rH\u0086\fø\u0001\u0000¢\u0006\u0004\b!\u0010\u000e\u001ai\u0010!\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\t\u0018\u0001\"\u0006\b\u0002\u0010\f\u0018\u0001\"\u0006\b\u0003\u0010\u000f\u0018\u0001*\u00020\u000120\b\u0004\u0010\u0005\u001a*\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0010H\u0086\fø\u0001\u0000¢\u0006\u0004\b!\u0010\u0011\u001aw\u0010!\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\t\u0018\u0001\"\u0006\b\u0002\u0010\f\u0018\u0001\"\u0006\b\u0003\u0010\u000f\u0018\u0001\"\u0006\b\u0004\u0010\u0012\u0018\u0001*\u00020\u000126\b\u0004\u0010\u0005\u001a0\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0013H\u0086\fø\u0001\u0000¢\u0006\u0004\b!\u0010\u0014\u001a\u0085\u0001\u0010!\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\t\u0018\u0001\"\u0006\b\u0002\u0010\f\u0018\u0001\"\u0006\b\u0003\u0010\u000f\u0018\u0001\"\u0006\b\u0004\u0010\u0012\u0018\u0001\"\u0006\b\u0005\u0010\u0015\u0018\u0001*\u00020\u00012<\b\u0004\u0010\u0005\u001a6\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0016H\u0086\fø\u0001\u0000¢\u0006\u0004\b!\u0010\u0017\u001a\u0093\u0001\u0010!\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\t\u0018\u0001\"\u0006\b\u0002\u0010\f\u0018\u0001\"\u0006\b\u0003\u0010\u000f\u0018\u0001\"\u0006\b\u0004\u0010\u0012\u0018\u0001\"\u0006\b\u0005\u0010\u0015\u0018\u0001\"\u0006\b\u0006\u0010\u0018\u0018\u0001*\u00020\u00012B\b\u0004\u0010\u0005\u001a<\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0019H\u0086\fø\u0001\u0000¢\u0006\u0004\b!\u0010\u001a\u001a¡\u0001\u0010!\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\t\u0018\u0001\"\u0006\b\u0002\u0010\f\u0018\u0001\"\u0006\b\u0003\u0010\u000f\u0018\u0001\"\u0006\b\u0004\u0010\u0012\u0018\u0001\"\u0006\b\u0005\u0010\u0015\u0018\u0001\"\u0006\b\u0006\u0010\u0018\u0018\u0001\"\u0006\b\u0007\u0010\u001b\u0018\u0001*\u00020\u00012H\b\u0004\u0010\u0005\u001aB\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u001cH\u0086\fø\u0001\u0000¢\u0006\u0004\b!\u0010\u001d\u001a¯\u0001\u0010!\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\t\u0018\u0001\"\u0006\b\u0002\u0010\f\u0018\u0001\"\u0006\b\u0003\u0010\u000f\u0018\u0001\"\u0006\b\u0004\u0010\u0012\u0018\u0001\"\u0006\b\u0005\u0010\u0015\u0018\u0001\"\u0006\b\u0006\u0010\u0018\u0018\u0001\"\u0006\b\u0007\u0010\u001b\u0018\u0001\"\u0006\b\b\u0010\u001e\u0018\u0001*\u00020\u00012N\b\u0004\u0010\u0005\u001aH\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u001fH\u0086\fø\u0001\u0000¢\u0006\u0004\b!\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"R", "Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;", "Lkotlin/Function1;", "Lzz/d;", "", "block", "Lvz/b0;", "coroutine", "(Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;Lh00/l;)V", "P0", "Lkotlin/Function2;", "(Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;Lh00/p;)V", "P1", "Lkotlin/Function3;", "(Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;Lh00/q;)V", "P2", "Lkotlin/Function4;", "(Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;Lh00/r;)V", "P3", "Lkotlin/Function5;", "(Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;Lh00/s;)V", "P4", "Lkotlin/Function6;", "(Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;Lh00/t;)V", "P5", "Lkotlin/Function7;", "(Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;Lh00/u;)V", "P6", "Lkotlin/Function8;", "(Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;Lh00/v;)V", "P7", "Lkotlin/Function9;", "(Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;Lh00/w;)V", "Coroutine", "expo-modules-core_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class AsyncFunctionBuilderKt {
    public static final /* synthetic */ <R> void Coroutine(AsyncFunctionBuilder asyncFunctionBuilder, l<? super d<? super R>, ? extends Object> block) {
        s.g(asyncFunctionBuilder, "<this>");
        s.g(block, "block");
        asyncFunctionBuilder.setFunction(new AsyncSuspendFunction(asyncFunctionBuilder.getName(), new AnyType[0], new AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$1(block, null)));
    }

    public static final /* synthetic */ <R> void coroutine(AsyncFunctionBuilder asyncFunctionBuilder, l<? super d<? super R>, ? extends Object> block) {
        s.g(asyncFunctionBuilder, "<this>");
        s.g(block, "block");
        asyncFunctionBuilder.setFunction(new AsyncSuspendFunction(asyncFunctionBuilder.getName(), new AnyType[0], new AsyncFunctionBuilderKt$coroutine$$inlined$Coroutine$1(block, null)));
    }

    public static final /* synthetic */ <R, P0> void Coroutine(AsyncFunctionBuilder asyncFunctionBuilder, p<? super P0, ? super d<? super R>, ? extends Object> block) {
        s.g(asyncFunctionBuilder, "<this>");
        s.g(block, "block");
        String name = asyncFunctionBuilder.getName();
        s.m(6, "P0");
        AnyType[] anyTypeArr = {AnyTypeKt.toAnyType(null)};
        s.l();
        asyncFunctionBuilder.setFunction(new AsyncSuspendFunction(name, anyTypeArr, new AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$2(block, null)));
    }

    public static final /* synthetic */ <R, P0> void coroutine(AsyncFunctionBuilder asyncFunctionBuilder, p<? super P0, ? super d<? super R>, ? extends Object> block) {
        s.g(asyncFunctionBuilder, "<this>");
        s.g(block, "block");
        String name = asyncFunctionBuilder.getName();
        s.m(6, "P0");
        AnyType[] anyTypeArr = {AnyTypeKt.toAnyType(null)};
        s.l();
        asyncFunctionBuilder.setFunction(new AsyncSuspendFunction(name, anyTypeArr, new AsyncFunctionBuilderKt$coroutine$$inlined$Coroutine$2(block, null)));
    }

    public static final /* synthetic */ <R, P0, P1> void Coroutine(AsyncFunctionBuilder asyncFunctionBuilder, q<? super P0, ? super P1, ? super d<? super R>, ? extends Object> block) {
        s.g(asyncFunctionBuilder, "<this>");
        s.g(block, "block");
        String name = asyncFunctionBuilder.getName();
        s.m(6, "P0");
        AnyType[] anyTypeArr = {AnyTypeKt.toAnyType(null)};
        s.l();
        asyncFunctionBuilder.setFunction(new AsyncSuspendFunction(name, anyTypeArr, new AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$3(block, null)));
    }

    public static final /* synthetic */ <R, P0, P1> void coroutine(AsyncFunctionBuilder asyncFunctionBuilder, q<? super P0, ? super P1, ? super d<? super R>, ? extends Object> block) {
        s.g(asyncFunctionBuilder, "<this>");
        s.g(block, "block");
        String name = asyncFunctionBuilder.getName();
        s.m(6, "P0");
        AnyType[] anyTypeArr = {AnyTypeKt.toAnyType(null)};
        s.l();
        asyncFunctionBuilder.setFunction(new AsyncSuspendFunction(name, anyTypeArr, new AsyncFunctionBuilderKt$coroutine$$inlined$Coroutine$3(block, null)));
    }

    public static final /* synthetic */ <R, P0, P1, P2> void Coroutine(AsyncFunctionBuilder asyncFunctionBuilder, r<? super P0, ? super P1, ? super P2, ? super d<? super R>, ? extends Object> block) {
        s.g(asyncFunctionBuilder, "<this>");
        s.g(block, "block");
        String name = asyncFunctionBuilder.getName();
        s.m(6, "P0");
        AnyType[] anyTypeArr = {AnyTypeKt.toAnyType(null)};
        s.l();
        asyncFunctionBuilder.setFunction(new AsyncSuspendFunction(name, anyTypeArr, new AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$4(block, null)));
    }

    public static final /* synthetic */ <R, P0, P1, P2> void coroutine(AsyncFunctionBuilder asyncFunctionBuilder, r<? super P0, ? super P1, ? super P2, ? super d<? super R>, ? extends Object> block) {
        s.g(asyncFunctionBuilder, "<this>");
        s.g(block, "block");
        String name = asyncFunctionBuilder.getName();
        s.m(6, "P0");
        AnyType[] anyTypeArr = {AnyTypeKt.toAnyType(null)};
        s.l();
        asyncFunctionBuilder.setFunction(new AsyncSuspendFunction(name, anyTypeArr, new AsyncFunctionBuilderKt$coroutine$$inlined$Coroutine$4(block, null)));
    }

    public static final /* synthetic */ <R, P0, P1, P2, P3> void Coroutine(AsyncFunctionBuilder asyncFunctionBuilder, h00.s<? super P0, ? super P1, ? super P2, ? super P3, ? super d<? super R>, ? extends Object> block) {
        s.g(asyncFunctionBuilder, "<this>");
        s.g(block, "block");
        String name = asyncFunctionBuilder.getName();
        s.m(6, "P0");
        AnyType[] anyTypeArr = {AnyTypeKt.toAnyType(null)};
        s.l();
        asyncFunctionBuilder.setFunction(new AsyncSuspendFunction(name, anyTypeArr, new AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$5(block, null)));
    }

    public static final /* synthetic */ <R, P0, P1, P2, P3> void coroutine(AsyncFunctionBuilder asyncFunctionBuilder, h00.s<? super P0, ? super P1, ? super P2, ? super P3, ? super d<? super R>, ? extends Object> block) {
        s.g(asyncFunctionBuilder, "<this>");
        s.g(block, "block");
        String name = asyncFunctionBuilder.getName();
        s.m(6, "P0");
        AnyType[] anyTypeArr = {AnyTypeKt.toAnyType(null)};
        s.l();
        asyncFunctionBuilder.setFunction(new AsyncSuspendFunction(name, anyTypeArr, new AsyncFunctionBuilderKt$coroutine$$inlined$Coroutine$5(block, null)));
    }

    public static final /* synthetic */ <R, P0, P1, P2, P3, P4> void Coroutine(AsyncFunctionBuilder asyncFunctionBuilder, t<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super d<? super R>, ? extends Object> block) {
        s.g(asyncFunctionBuilder, "<this>");
        s.g(block, "block");
        String name = asyncFunctionBuilder.getName();
        s.m(6, "P0");
        AnyType[] anyTypeArr = {AnyTypeKt.toAnyType(null)};
        s.l();
        asyncFunctionBuilder.setFunction(new AsyncSuspendFunction(name, anyTypeArr, new AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$6(block, null)));
    }

    public static final /* synthetic */ <R, P0, P1, P2, P3, P4> void coroutine(AsyncFunctionBuilder asyncFunctionBuilder, t<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super d<? super R>, ? extends Object> block) {
        s.g(asyncFunctionBuilder, "<this>");
        s.g(block, "block");
        String name = asyncFunctionBuilder.getName();
        s.m(6, "P0");
        AnyType[] anyTypeArr = {AnyTypeKt.toAnyType(null)};
        s.l();
        asyncFunctionBuilder.setFunction(new AsyncSuspendFunction(name, anyTypeArr, new AsyncFunctionBuilderKt$coroutine$$inlined$Coroutine$6(block, null)));
    }

    public static final /* synthetic */ <R, P0, P1, P2, P3, P4, P5> void Coroutine(AsyncFunctionBuilder asyncFunctionBuilder, u<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super d<? super R>, ? extends Object> block) {
        s.g(asyncFunctionBuilder, "<this>");
        s.g(block, "block");
        String name = asyncFunctionBuilder.getName();
        s.m(6, "P0");
        AnyType[] anyTypeArr = {AnyTypeKt.toAnyType(null)};
        s.l();
        asyncFunctionBuilder.setFunction(new AsyncSuspendFunction(name, anyTypeArr, new AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$7(block, null)));
    }

    public static final /* synthetic */ <R, P0, P1, P2, P3, P4, P5> void coroutine(AsyncFunctionBuilder asyncFunctionBuilder, u<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super d<? super R>, ? extends Object> block) {
        s.g(asyncFunctionBuilder, "<this>");
        s.g(block, "block");
        String name = asyncFunctionBuilder.getName();
        s.m(6, "P0");
        AnyType[] anyTypeArr = {AnyTypeKt.toAnyType(null)};
        s.l();
        asyncFunctionBuilder.setFunction(new AsyncSuspendFunction(name, anyTypeArr, new AsyncFunctionBuilderKt$coroutine$$inlined$Coroutine$7(block, null)));
    }

    public static final /* synthetic */ <R, P0, P1, P2, P3, P4, P5, P6> void Coroutine(AsyncFunctionBuilder asyncFunctionBuilder, v<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super P6, ? super d<? super R>, ? extends Object> block) {
        s.g(asyncFunctionBuilder, "<this>");
        s.g(block, "block");
        String name = asyncFunctionBuilder.getName();
        s.m(6, "P0");
        AnyType[] anyTypeArr = {AnyTypeKt.toAnyType(null)};
        s.l();
        asyncFunctionBuilder.setFunction(new AsyncSuspendFunction(name, anyTypeArr, new AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$8(block, null)));
    }

    public static final /* synthetic */ <R, P0, P1, P2, P3, P4, P5, P6> void coroutine(AsyncFunctionBuilder asyncFunctionBuilder, v<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super P6, ? super d<? super R>, ? extends Object> block) {
        s.g(asyncFunctionBuilder, "<this>");
        s.g(block, "block");
        String name = asyncFunctionBuilder.getName();
        s.m(6, "P0");
        AnyType[] anyTypeArr = {AnyTypeKt.toAnyType(null)};
        s.l();
        asyncFunctionBuilder.setFunction(new AsyncSuspendFunction(name, anyTypeArr, new AsyncFunctionBuilderKt$coroutine$$inlined$Coroutine$8(block, null)));
    }

    public static final /* synthetic */ <R, P0, P1, P2, P3, P4, P5, P6, P7> void Coroutine(AsyncFunctionBuilder asyncFunctionBuilder, w<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super P6, ? super P7, ? super d<? super R>, ? extends Object> block) {
        s.g(asyncFunctionBuilder, "<this>");
        s.g(block, "block");
        String name = asyncFunctionBuilder.getName();
        s.m(6, "P0");
        AnyType[] anyTypeArr = {AnyTypeKt.toAnyType(null)};
        s.l();
        asyncFunctionBuilder.setFunction(new AsyncSuspendFunction(name, anyTypeArr, new AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$9(block, null)));
    }

    public static final /* synthetic */ <R, P0, P1, P2, P3, P4, P5, P6, P7> void coroutine(AsyncFunctionBuilder asyncFunctionBuilder, w<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super P6, ? super P7, ? super d<? super R>, ? extends Object> block) {
        s.g(asyncFunctionBuilder, "<this>");
        s.g(block, "block");
        String name = asyncFunctionBuilder.getName();
        s.m(6, "P0");
        AnyType[] anyTypeArr = {AnyTypeKt.toAnyType(null)};
        s.l();
        asyncFunctionBuilder.setFunction(new AsyncSuspendFunction(name, anyTypeArr, new AsyncFunctionBuilderKt$coroutine$$inlined$Coroutine$9(block, null)));
    }
}