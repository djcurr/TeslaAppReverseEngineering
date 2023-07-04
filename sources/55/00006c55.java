package ezvcard.property;

import java.util.Date;

/* loaded from: classes5.dex */
public class Revision extends SimpleProperty<Date> {
    public Revision(Date date) {
        super(date);
    }

    public static Revision now() {
        return new Revision(new Date());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Revision(Revision revision) {
        super((SimpleProperty) revision);
        this.value = revision.value == 0 ? 0 : new Date(((Date) revision.value).getTime());
    }

    @Override // ezvcard.property.VCardProperty
    public Revision copy() {
        return new Revision(this);
    }
}