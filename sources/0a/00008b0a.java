package net.time4j.engine;

import ch.qos.logback.core.CoreConstants;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: classes5.dex */
public interface j0<U> {

    /* loaded from: classes5.dex */
    public static final class a<U> implements Serializable {
        private static final long serialVersionUID = 1564804888291509484L;
        private final long amount;
        private final U unit;

        private a(long j11, U u11) {
            Objects.requireNonNull(u11, "Missing chronological unit.");
            if (j11 >= 0) {
                this.amount = j11;
                this.unit = u11;
                return;
            }
            throw new IllegalArgumentException("Temporal amount must be positive or zero: " + j11);
        }

        public static <U> a<U> c(long j11, U u11) {
            return new a<>(j11, u11);
        }

        private void readObject(ObjectInputStream objectInputStream) {
            objectInputStream.defaultReadObject();
            if (this.unit == null || this.amount < 0) {
                throw new InvalidObjectException("Inconsistent state.");
            }
        }

        public long a() {
            return this.amount;
        }

        public U b() {
            return this.unit;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) a.class.cast(obj);
                return this.amount == aVar.amount && this.unit.equals(aVar.unit);
            }
            return false;
        }

        public int hashCode() {
            long j11 = this.amount;
            return (this.unit.hashCode() * 29) + ((int) (j11 ^ (j11 >>> 32)));
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('P');
            sb2.append(this.amount);
            sb2.append(CoreConstants.CURLY_LEFT);
            sb2.append(this.unit);
            sb2.append(CoreConstants.CURLY_RIGHT);
            return sb2.toString();
        }
    }

    boolean a();

    List<a<U>> b();

    boolean isEmpty();
}