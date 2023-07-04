package org.spongycastle.cms;

import java.io.OutputStream;

/* loaded from: classes5.dex */
public interface CMSProcessable {
    Object getContent();

    void write(OutputStream outputStream);
}