package ezvcard.property;

import ezvcard.VCard;
import ezvcard.VCardVersion;
import ezvcard.a;
import ezvcard.parameter.VCardParameters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import vw.b;
import vw.c;

/* loaded from: classes5.dex */
public abstract class VCardProperty implements Comparable<VCardProperty> {
    protected String group;
    protected VCardParameters parameters;

    public VCardProperty() {
        this.parameters = new VCardParameters();
    }

    protected void _validate(List<c> list, VCardVersion vCardVersion, VCard vCard) {
    }

    public void addParameter(String str, String str2) {
        this.parameters.f(str, str2);
    }

    public VCardProperty copy() {
        Class<?> cls = getClass();
        try {
            return (VCardProperty) cls.getConstructor(cls).newInstance(this);
        } catch (Exception e11) {
            throw new UnsupportedOperationException(a.INSTANCE.getExceptionMessage(31, cls.getName()), e11);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            VCardProperty vCardProperty = (VCardProperty) obj;
            String str = this.group;
            if (str == null) {
                if (vCardProperty.group != null) {
                    return false;
                }
            } else if (!str.equalsIgnoreCase(vCardProperty.group)) {
                return false;
            }
            return this.parameters.equals(vCardProperty.parameters);
        }
        return false;
    }

    public String getGroup() {
        return this.group;
    }

    public Integer getIndex() {
        return this.parameters.s();
    }

    public String getLanguage() {
        return this.parameters.u();
    }

    public String getParameter(String str) {
        return this.parameters.d(str);
    }

    public VCardParameters getParameters() {
        return this.parameters;
    }

    public List<ezvcard.parameter.c> getPids() {
        return this.parameters.x();
    }

    public Integer getPref() {
        return this.parameters.y();
    }

    public final VCardVersion[] getSupportedVersions() {
        b bVar = (b) getClass().getAnnotation(b.class);
        return bVar == null ? VCardVersion.values() : bVar.value();
    }

    public int hashCode() {
        String str = this.group;
        return (((str == null ? 0 : str.toLowerCase().hashCode()) + 31) * 31) + this.parameters.hashCode();
    }

    public final boolean isSupportedBy(VCardVersion vCardVersion) {
        for (VCardVersion vCardVersion2 : getSupportedVersions()) {
            if (vCardVersion2 == vCardVersion) {
                return true;
            }
        }
        return false;
    }

    public void removeParameter(String str) {
        this.parameters.i(str);
    }

    public void setGroup(String str) {
        this.group = str;
    }

    public void setIndex(Integer num) {
        this.parameters.K(num);
    }

    public void setLanguage(String str) {
        this.parameters.M(str);
    }

    public void setParameter(String str, String str2) {
        this.parameters.j(str, str2);
    }

    public void setParameters(VCardParameters vCardParameters) {
        if (vCardParameters != null) {
            this.parameters = vCardParameters;
            return;
        }
        throw new NullPointerException(a.INSTANCE.getExceptionMessage(42, new Object[0]));
    }

    public void setPref(Integer num) {
        this.parameters.P(num);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getName());
        sb2.append(" [ group=");
        sb2.append(this.group);
        sb2.append(" | parameters=");
        sb2.append(this.parameters);
        for (Map.Entry<String, Object> entry : toStringValues().entrySet()) {
            Object value = entry.getValue();
            sb2.append(" | ");
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(value);
        }
        sb2.append(" ]");
        return sb2.toString();
    }

    protected Map<String, Object> toStringValues() {
        return Collections.emptyMap();
    }

    public final List<c> validate(VCardVersion vCardVersion, VCard vCard) {
        ArrayList arrayList = new ArrayList(0);
        if (!isSupportedBy(vCardVersion)) {
            arrayList.add(new c(2, Arrays.toString(getSupportedVersions())));
        }
        arrayList.addAll(this.parameters.U(vCardVersion));
        if (this.group != null) {
            gh.a syntaxStyle = vCardVersion.getSyntaxStyle();
            jh.a a11 = jh.b.a(syntaxStyle, true);
            if (!a11.c(this.group)) {
                if (syntaxStyle == gh.a.OLD) {
                    arrayList.add(new c(32, this.group, a11.d().e(true)));
                } else {
                    arrayList.add(new c(23, this.group));
                }
            }
        }
        _validate(arrayList, vCardVersion, vCard);
        return arrayList;
    }

    @Override // java.lang.Comparable
    public int compareTo(VCardProperty vCardProperty) {
        Integer y11 = getParameters().y();
        Integer y12 = vCardProperty.getParameters().y();
        if (y11 == null && y12 == null) {
            return 0;
        }
        if (y11 == null) {
            return 1;
        }
        if (y12 == null) {
            return -1;
        }
        return y12.compareTo(y11);
    }

    public List<String> getParameters(String str) {
        return Collections.unmodifiableList(this.parameters.e(str));
    }

    public VCardProperty(VCardProperty vCardProperty) {
        this.group = vCardProperty.group;
        this.parameters = new VCardParameters(vCardProperty.parameters);
    }
}