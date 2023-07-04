package yw;

import ezvcard.property.Profile;

/* loaded from: classes5.dex */
public class n0 extends y0<Profile> {
    public n0() {
        super(Profile.class, "PROFILE");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yw.t0
    /* renamed from: j */
    public Profile i(String str) {
        Profile profile = new Profile();
        profile.setValue(str);
        return profile;
    }
}