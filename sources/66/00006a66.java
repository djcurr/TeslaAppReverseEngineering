package expo.modules.kotlin;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import i00.a;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\t\u0010\u0005\u001a\u00020\u0002H\u0096\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lexpo/modules/kotlin/ReadableArrayIterator;", "", "Lcom/facebook/react/bridge/Dynamic;", "", "hasNext", "next", "Lcom/facebook/react/bridge/ReadableArray;", "array", "Lcom/facebook/react/bridge/ReadableArray;", "", "current", "I", "getCurrent", "()I", "setCurrent", "(I)V", "<init>", "(Lcom/facebook/react/bridge/ReadableArray;)V", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class ReadableArrayIterator implements Iterator<Dynamic>, a {
    private final ReadableArray array;
    private int current;

    public ReadableArrayIterator(ReadableArray array) {
        s.g(array, "array");
        this.array = array;
    }

    public final int getCurrent() {
        return this.current;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.current < this.array.size();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setCurrent(int i11) {
        this.current = i11;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public Dynamic next() {
        ReadableArray readableArray = this.array;
        int i11 = this.current;
        this.current = i11 + 1;
        Dynamic dynamic = readableArray.getDynamic(i11);
        s.f(dynamic, "array.getDynamic(current++)");
        return dynamic;
    }
}