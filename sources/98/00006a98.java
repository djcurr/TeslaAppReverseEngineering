package expo.modules.kotlin.functions;

import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeKt;
import h00.l;
import h00.q;
import h00.r;
import h00.t;
import h00.u;
import h00.w;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import vz.p;
import vz.v;
import zz.d;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010(\u001a\u00020#¢\u0006\u0004\b4\u00105J;\u0010\u0007\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u001e\b\u0004\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ;\u0010\t\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u001e\b\u0004\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\bJI\u0010\u0007\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\n\u0018\u00012$\b\u0004\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\fJI\u0010\t\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\n\u0018\u00012$\b\u0004\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\fJW\u0010\u0007\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\n\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u00012*\b\u0004\u0010\u0005\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000eH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u000fJW\u0010\t\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\n\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u00012*\b\u0004\u0010\u0005\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000eH\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\u000fJe\u0010\u0007\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\n\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u0001\"\u0006\b\u0003\u0010\u0010\u0018\u000120\b\u0004\u0010\u0005\u001a*\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0012Je\u0010\t\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\n\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u0001\"\u0006\b\u0003\u0010\u0010\u0018\u000120\b\u0004\u0010\u0005\u001a*\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0012Js\u0010\u0007\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\n\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u0001\"\u0006\b\u0003\u0010\u0010\u0018\u0001\"\u0006\b\u0004\u0010\u0013\u0018\u000126\b\u0004\u0010\u0005\u001a0\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0014H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0015Js\u0010\t\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\n\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u0001\"\u0006\b\u0003\u0010\u0010\u0018\u0001\"\u0006\b\u0004\u0010\u0013\u0018\u000126\b\u0004\u0010\u0005\u001a0\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0014H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0015J\u0081\u0001\u0010\u0007\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\n\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u0001\"\u0006\b\u0003\u0010\u0010\u0018\u0001\"\u0006\b\u0004\u0010\u0013\u0018\u0001\"\u0006\b\u0005\u0010\u0016\u0018\u00012<\b\u0004\u0010\u0005\u001a6\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0017H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0018J\u0081\u0001\u0010\t\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\n\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u0001\"\u0006\b\u0003\u0010\u0010\u0018\u0001\"\u0006\b\u0004\u0010\u0013\u0018\u0001\"\u0006\b\u0005\u0010\u0016\u0018\u00012<\b\u0004\u0010\u0005\u001a6\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0017H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0018J\u008f\u0001\u0010\u0007\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\n\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u0001\"\u0006\b\u0003\u0010\u0010\u0018\u0001\"\u0006\b\u0004\u0010\u0013\u0018\u0001\"\u0006\b\u0005\u0010\u0016\u0018\u0001\"\u0006\b\u0006\u0010\u0019\u0018\u00012B\b\u0004\u0010\u0005\u001a<\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001aH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u001bJ\u008f\u0001\u0010\t\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\n\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u0001\"\u0006\b\u0003\u0010\u0010\u0018\u0001\"\u0006\b\u0004\u0010\u0013\u0018\u0001\"\u0006\b\u0005\u0010\u0016\u0018\u0001\"\u0006\b\u0006\u0010\u0019\u0018\u00012B\b\u0004\u0010\u0005\u001a<\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001aH\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\u001bJ\u009d\u0001\u0010\u0007\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\n\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u0001\"\u0006\b\u0003\u0010\u0010\u0018\u0001\"\u0006\b\u0004\u0010\u0013\u0018\u0001\"\u0006\b\u0005\u0010\u0016\u0018\u0001\"\u0006\b\u0006\u0010\u0019\u0018\u0001\"\u0006\b\u0007\u0010\u001c\u0018\u00012H\b\u0004\u0010\u0005\u001aB\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001dH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u001eJ\u009d\u0001\u0010\t\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\n\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u0001\"\u0006\b\u0003\u0010\u0010\u0018\u0001\"\u0006\b\u0004\u0010\u0013\u0018\u0001\"\u0006\b\u0005\u0010\u0016\u0018\u0001\"\u0006\b\u0006\u0010\u0019\u0018\u0001\"\u0006\b\u0007\u0010\u001c\u0018\u00012H\b\u0004\u0010\u0005\u001aB\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001dH\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\u001eJ«\u0001\u0010\u0007\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\n\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u0001\"\u0006\b\u0003\u0010\u0010\u0018\u0001\"\u0006\b\u0004\u0010\u0013\u0018\u0001\"\u0006\b\u0005\u0010\u0016\u0018\u0001\"\u0006\b\u0006\u0010\u0019\u0018\u0001\"\u0006\b\u0007\u0010\u001c\u0018\u0001\"\u0006\b\b\u0010\u001f\u0018\u00012N\b\u0004\u0010\u0005\u001aH\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010 H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010!J«\u0001\u0010\t\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\n\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u0001\"\u0006\b\u0003\u0010\u0010\u0018\u0001\"\u0006\b\u0004\u0010\u0013\u0018\u0001\"\u0006\b\u0005\u0010\u0016\u0018\u0001\"\u0006\b\u0006\u0010\u0019\u0018\u0001\"\u0006\b\u0007\u0010\u001c\u0018\u0001\"\u0006\b\b\u0010\u001f\u0018\u00012N\b\u0004\u0010\u0005\u001aH\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010 H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010!J\u001b\u0010'\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"H\u0000¢\u0006\u0004\b%\u0010&R\u0019\u0010(\u001a\u00020#8\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R*\u0010,\u001a\u0004\u0018\u00010$8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b,\u0010-\u0012\u0004\b2\u00103\u001a\u0004\b.\u0010/\"\u0004\b0\u00101\u0082\u0002\u0004\n\u0002\b\u0019¨\u00066"}, d2 = {"Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;", "", "R", "Lkotlin/Function1;", "Lzz/d;", "block", "Lvz/b0;", "suspendBody", "(Lh00/l;)V", "SuspendBody", "P0", "Lkotlin/Function2;", "(Lh00/p;)V", "P1", "Lkotlin/Function3;", "(Lh00/q;)V", "P2", "Lkotlin/Function4;", "(Lh00/r;)V", "P3", "Lkotlin/Function5;", "(Lh00/s;)V", "P4", "Lkotlin/Function6;", "(Lh00/t;)V", "P5", "Lkotlin/Function7;", "(Lh00/u;)V", "P6", "Lkotlin/Function8;", "(Lh00/v;)V", "P7", "Lkotlin/Function9;", "(Lh00/w;)V", "Lvz/p;", "", "Lexpo/modules/kotlin/functions/AnyFunction;", "build$expo_modules_core_release", "()Lvz/p;", "build", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "function", "Lexpo/modules/kotlin/functions/AnyFunction;", "getFunction", "()Lexpo/modules/kotlin/functions/AnyFunction;", "setFunction", "(Lexpo/modules/kotlin/functions/AnyFunction;)V", "getFunction$annotations", "()V", "<init>", "(Ljava/lang/String;)V", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class AsyncFunctionBuilder {
    private AnyFunction function;
    private final String name;

    public AsyncFunctionBuilder(String name) {
        s.g(name, "name");
        this.name = name;
    }

    public static /* synthetic */ void getFunction$annotations() {
    }

    public final /* synthetic */ <R> void SuspendBody(l<? super d<? super R>, ? extends Object> block) {
        s.g(block, "block");
        setFunction(new AsyncSuspendFunction(getName(), new AnyType[0], new AsyncFunctionBuilder$SuspendBody$1(block, null)));
    }

    public final p<String, AnyFunction> build$expo_modules_core_release() {
        String str = this.name;
        AnyFunction anyFunction = this.function;
        if (anyFunction != null) {
            return v.a(str, anyFunction);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final AnyFunction getFunction() {
        return this.function;
    }

    public final String getName() {
        return this.name;
    }

    public final void setFunction(AnyFunction anyFunction) {
        this.function = anyFunction;
    }

    public final /* synthetic */ <R> void suspendBody(l<? super d<? super R>, ? extends Object> block) {
        s.g(block, "block");
        setFunction(new AsyncSuspendFunction(getName(), new AnyType[0], new AsyncFunctionBuilder$suspendBody$$inlined$SuspendBody$1(block, null)));
    }

    public final /* synthetic */ <R, P0> void SuspendBody(h00.p<? super P0, ? super d<? super R>, ? extends Object> block) {
        s.g(block, "block");
        String name = getName();
        s.m(6, "P0");
        AnyType[] anyTypeArr = {AnyTypeKt.toAnyType(null)};
        s.l();
        setFunction(new AsyncSuspendFunction(name, anyTypeArr, new AsyncFunctionBuilder$SuspendBody$2(block, null)));
    }

    public final /* synthetic */ <R, P0> void suspendBody(h00.p<? super P0, ? super d<? super R>, ? extends Object> block) {
        s.g(block, "block");
        String name = getName();
        s.m(6, "P0");
        AnyType[] anyTypeArr = {AnyTypeKt.toAnyType(null)};
        s.l();
        setFunction(new AsyncSuspendFunction(name, anyTypeArr, new AsyncFunctionBuilder$suspendBody$$inlined$SuspendBody$2(block, null)));
    }

    public final /* synthetic */ <R, P0, P1> void SuspendBody(q<? super P0, ? super P1, ? super d<? super R>, ? extends Object> block) {
        s.g(block, "block");
        String name = getName();
        s.m(6, "P0");
        AnyType[] anyTypeArr = {AnyTypeKt.toAnyType(null)};
        s.l();
        setFunction(new AsyncSuspendFunction(name, anyTypeArr, new AsyncFunctionBuilder$SuspendBody$3(block, null)));
    }

    public final /* synthetic */ <R, P0, P1> void suspendBody(q<? super P0, ? super P1, ? super d<? super R>, ? extends Object> block) {
        s.g(block, "block");
        String name = getName();
        s.m(6, "P0");
        AnyType[] anyTypeArr = {AnyTypeKt.toAnyType(null)};
        s.l();
        setFunction(new AsyncSuspendFunction(name, anyTypeArr, new AsyncFunctionBuilder$suspendBody$$inlined$SuspendBody$3(block, null)));
    }

    public final /* synthetic */ <R, P0, P1, P2> void SuspendBody(r<? super P0, ? super P1, ? super P2, ? super d<? super R>, ? extends Object> block) {
        s.g(block, "block");
        String name = getName();
        s.m(6, "P0");
        AnyType[] anyTypeArr = {AnyTypeKt.toAnyType(null)};
        s.l();
        setFunction(new AsyncSuspendFunction(name, anyTypeArr, new AsyncFunctionBuilder$SuspendBody$4(block, null)));
    }

    public final /* synthetic */ <R, P0, P1, P2> void suspendBody(r<? super P0, ? super P1, ? super P2, ? super d<? super R>, ? extends Object> block) {
        s.g(block, "block");
        String name = getName();
        s.m(6, "P0");
        AnyType[] anyTypeArr = {AnyTypeKt.toAnyType(null)};
        s.l();
        setFunction(new AsyncSuspendFunction(name, anyTypeArr, new AsyncFunctionBuilder$suspendBody$$inlined$SuspendBody$4(block, null)));
    }

    public final /* synthetic */ <R, P0, P1, P2, P3> void SuspendBody(h00.s<? super P0, ? super P1, ? super P2, ? super P3, ? super d<? super R>, ? extends Object> block) {
        s.g(block, "block");
        String name = getName();
        s.m(6, "P0");
        AnyType[] anyTypeArr = {AnyTypeKt.toAnyType(null)};
        s.l();
        setFunction(new AsyncSuspendFunction(name, anyTypeArr, new AsyncFunctionBuilder$SuspendBody$5(block, null)));
    }

    public final /* synthetic */ <R, P0, P1, P2, P3> void suspendBody(h00.s<? super P0, ? super P1, ? super P2, ? super P3, ? super d<? super R>, ? extends Object> block) {
        s.g(block, "block");
        String name = getName();
        s.m(6, "P0");
        AnyType[] anyTypeArr = {AnyTypeKt.toAnyType(null)};
        s.l();
        setFunction(new AsyncSuspendFunction(name, anyTypeArr, new AsyncFunctionBuilder$suspendBody$$inlined$SuspendBody$5(block, null)));
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4> void SuspendBody(t<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super d<? super R>, ? extends Object> block) {
        s.g(block, "block");
        String name = getName();
        s.m(6, "P0");
        AnyType[] anyTypeArr = {AnyTypeKt.toAnyType(null)};
        s.l();
        setFunction(new AsyncSuspendFunction(name, anyTypeArr, new AsyncFunctionBuilder$SuspendBody$6(block, null)));
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4> void suspendBody(t<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super d<? super R>, ? extends Object> block) {
        s.g(block, "block");
        String name = getName();
        s.m(6, "P0");
        AnyType[] anyTypeArr = {AnyTypeKt.toAnyType(null)};
        s.l();
        setFunction(new AsyncSuspendFunction(name, anyTypeArr, new AsyncFunctionBuilder$suspendBody$$inlined$SuspendBody$6(block, null)));
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5> void SuspendBody(u<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super d<? super R>, ? extends Object> block) {
        s.g(block, "block");
        String name = getName();
        s.m(6, "P0");
        AnyType[] anyTypeArr = {AnyTypeKt.toAnyType(null)};
        s.l();
        setFunction(new AsyncSuspendFunction(name, anyTypeArr, new AsyncFunctionBuilder$SuspendBody$7(block, null)));
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5> void suspendBody(u<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super d<? super R>, ? extends Object> block) {
        s.g(block, "block");
        String name = getName();
        s.m(6, "P0");
        AnyType[] anyTypeArr = {AnyTypeKt.toAnyType(null)};
        s.l();
        setFunction(new AsyncSuspendFunction(name, anyTypeArr, new AsyncFunctionBuilder$suspendBody$$inlined$SuspendBody$7(block, null)));
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5, P6> void SuspendBody(h00.v<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super P6, ? super d<? super R>, ? extends Object> block) {
        s.g(block, "block");
        String name = getName();
        s.m(6, "P0");
        AnyType[] anyTypeArr = {AnyTypeKt.toAnyType(null)};
        s.l();
        setFunction(new AsyncSuspendFunction(name, anyTypeArr, new AsyncFunctionBuilder$SuspendBody$8(block, null)));
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5, P6> void suspendBody(h00.v<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super P6, ? super d<? super R>, ? extends Object> block) {
        s.g(block, "block");
        String name = getName();
        s.m(6, "P0");
        AnyType[] anyTypeArr = {AnyTypeKt.toAnyType(null)};
        s.l();
        setFunction(new AsyncSuspendFunction(name, anyTypeArr, new AsyncFunctionBuilder$suspendBody$$inlined$SuspendBody$8(block, null)));
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5, P6, P7> void SuspendBody(w<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super P6, ? super P7, ? super d<? super R>, ? extends Object> block) {
        s.g(block, "block");
        String name = getName();
        s.m(6, "P0");
        AnyType[] anyTypeArr = {AnyTypeKt.toAnyType(null)};
        s.l();
        setFunction(new AsyncSuspendFunction(name, anyTypeArr, new AsyncFunctionBuilder$SuspendBody$9(block, null)));
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5, P6, P7> void suspendBody(w<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super P6, ? super P7, ? super d<? super R>, ? extends Object> block) {
        s.g(block, "block");
        String name = getName();
        s.m(6, "P0");
        AnyType[] anyTypeArr = {AnyTypeKt.toAnyType(null)};
        s.l();
        setFunction(new AsyncSuspendFunction(name, anyTypeArr, new AsyncFunctionBuilder$suspendBody$$inlined$SuspendBody$9(block, null)));
    }
}