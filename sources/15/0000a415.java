package org.spongycastle.pqc.jcajce.interfaces;

import java.security.PrivateKey;

/* loaded from: classes4.dex */
public interface NHPrivateKey extends NHKey, PrivateKey {
    short[] getSecretData();
}