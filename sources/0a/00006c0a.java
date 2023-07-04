package ezvcard.io;

import ezvcard.VCard;
import ezvcard.property.VCardProperty;

/* loaded from: classes5.dex */
public class EmbeddedVCardException extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    private final a f25386a;

    /* loaded from: classes5.dex */
    public interface a {
        VCardProperty d();

        void e(VCard vCard);
    }

    public EmbeddedVCardException(a aVar) {
        this.f25386a = aVar;
    }

    public VCardProperty a() {
        a aVar = this.f25386a;
        if (aVar == null) {
            return null;
        }
        return aVar.d();
    }

    public void b(VCard vCard) {
        a aVar = this.f25386a;
        if (aVar == null) {
            return;
        }
        aVar.e(vCard);
    }
}