package org.spongycastle.jce.interfaces;

import javax.crypto.interfaces.DHKey;
import org.spongycastle.jce.spec.ElGamalParameterSpec;

/* loaded from: classes4.dex */
public interface ElGamalKey extends DHKey {
    ElGamalParameterSpec getParameters();
}