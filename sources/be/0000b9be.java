package v70;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

/* loaded from: classes5.dex */
public class m implements n {

    /* renamed from: a  reason: collision with root package name */
    private Collection f54363a;

    public m(Collection collection) {
        Objects.requireNonNull(collection, "collection cannot be null");
        this.f54363a = collection;
    }

    public Collection a() {
        return new ArrayList(this.f54363a);
    }

    public Object clone() {
        return new m(this.f54363a);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("X509CollectionStoreParameters: [\n");
        stringBuffer.append("  collection: " + this.f54363a + "\n");
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}