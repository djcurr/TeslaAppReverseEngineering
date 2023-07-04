package com.airbnb.android.react.maps;

import android.content.Context;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Tile;
import com.google.android.gms.maps.model.TileOverlay;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.TileProvider;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public class f extends c {

    /* renamed from: a  reason: collision with root package name */
    private TileOverlayOptions f9796a;

    /* renamed from: b  reason: collision with root package name */
    private TileOverlay f9797b;

    /* renamed from: c  reason: collision with root package name */
    private a f9798c;

    /* renamed from: d  reason: collision with root package name */
    private String f9799d;

    /* renamed from: e  reason: collision with root package name */
    private float f9800e;

    /* renamed from: f  reason: collision with root package name */
    private float f9801f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements TileProvider {

        /* renamed from: a  reason: collision with root package name */
        private int f9802a;

        /* renamed from: b  reason: collision with root package name */
        private String f9803b;

        public a(f fVar, int i11, String str) {
            this.f9802a = i11;
            this.f9803b = str;
        }

        private String a(int i11, int i12, int i13) {
            return this.f9803b.replace("{x}", Integer.toString(i11)).replace("{y}", Integer.toString(i12)).replace("{z}", Integer.toString(i13));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v0, types: [int] */
        /* JADX WARN: Type inference failed for: r8v2 */
        /* JADX WARN: Type inference failed for: r8v3 */
        /* JADX WARN: Type inference failed for: r8v4 */
        /* JADX WARN: Type inference failed for: r8v5, types: [java.io.InputStream] */
        /* JADX WARN: Type inference failed for: r8v6, types: [java.io.InputStream] */
        /* JADX WARN: Type inference failed for: r8v7, types: [java.io.InputStream] */
        /* JADX WARN: Type inference failed for: r8v8, types: [java.io.FileInputStream, java.io.InputStream] */
        /* JADX WARN: Type inference failed for: r9v0, types: [int] */
        /* JADX WARN: Type inference failed for: r9v1 */
        /* JADX WARN: Type inference failed for: r9v4, types: [java.io.ByteArrayOutputStream] */
        /* JADX WARN: Type inference failed for: r9v8 */
        private byte[] b(int i11, int i12, int i13) {
            Throwable th2;
            ByteArrayOutputStream byteArrayOutputStream;
            try {
                try {
                    i12 = new FileInputStream(new File(a(i11, i12, i13)));
                    try {
                        byteArrayOutputStream = new ByteArrayOutputStream();
                    } catch (IOException e11) {
                        e = e11;
                        byteArrayOutputStream = null;
                    } catch (OutOfMemoryError e12) {
                        e = e12;
                        byteArrayOutputStream = null;
                    } catch (Throwable th3) {
                        i13 = 0;
                        th2 = th3;
                        if (i12 != 0) {
                            try {
                                i12.close();
                            } catch (Exception unused) {
                            }
                        }
                        if (i13 != 0) {
                            try {
                                i13.close();
                            } catch (Exception unused2) {
                            }
                        }
                        throw th2;
                    }
                    try {
                        byte[] bArr = new byte[16384];
                        while (true) {
                            int read = i12.read(bArr, 0, 16384);
                            if (read == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, read);
                        }
                        byteArrayOutputStream.flush();
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        try {
                            i12.close();
                        } catch (Exception unused3) {
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (Exception unused4) {
                        }
                        return byteArray;
                    } catch (IOException e13) {
                        e = e13;
                        e.printStackTrace();
                        if (i12 != 0) {
                            try {
                                i12.close();
                            } catch (Exception unused5) {
                            }
                        }
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (Exception unused6) {
                            }
                        }
                        return null;
                    } catch (OutOfMemoryError e14) {
                        e = e14;
                        e.printStackTrace();
                        if (i12 != 0) {
                            try {
                                i12.close();
                            } catch (Exception unused7) {
                            }
                        }
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (Exception unused8) {
                            }
                        }
                        return null;
                    }
                } catch (IOException e15) {
                    e = e15;
                    i12 = 0;
                    byteArrayOutputStream = null;
                } catch (OutOfMemoryError e16) {
                    e = e16;
                    i12 = 0;
                    byteArrayOutputStream = null;
                } catch (Throwable th4) {
                    i13 = 0;
                    th2 = th4;
                    i12 = 0;
                }
            } catch (Throwable th5) {
                th2 = th5;
            }
        }

        public void c(String str) {
            this.f9803b = str;
        }

        public void d(int i11) {
            this.f9802a = i11;
        }

        @Override // com.google.android.gms.maps.model.TileProvider
        public Tile getTile(int i11, int i12, int i13) {
            byte[] b11 = b(i11, i12, i13);
            if (b11 == null) {
                return TileProvider.NO_TILE;
            }
            int i14 = this.f9802a;
            return new Tile(i14, i14, b11);
        }
    }

    public f(Context context) {
        super(context);
    }

    private TileOverlayOptions f() {
        TileOverlayOptions tileOverlayOptions = new TileOverlayOptions();
        tileOverlayOptions.zIndex(this.f9801f);
        a aVar = new a(this, (int) this.f9800e, this.f9799d);
        this.f9798c = aVar;
        tileOverlayOptions.tileProvider(aVar);
        return tileOverlayOptions;
    }

    @Override // com.airbnb.android.react.maps.c
    public void c(GoogleMap googleMap) {
        this.f9797b.remove();
    }

    public void d(GoogleMap googleMap) {
        this.f9797b = googleMap.addTileOverlay(getTileOverlayOptions());
    }

    @Override // com.airbnb.android.react.maps.c
    public Object getFeature() {
        return this.f9797b;
    }

    public TileOverlayOptions getTileOverlayOptions() {
        if (this.f9796a == null) {
            this.f9796a = f();
        }
        return this.f9796a;
    }

    public void setPathTemplate(String str) {
        this.f9799d = str;
        a aVar = this.f9798c;
        if (aVar != null) {
            aVar.c(str);
        }
        TileOverlay tileOverlay = this.f9797b;
        if (tileOverlay != null) {
            tileOverlay.clearTileCache();
        }
    }

    public void setTileSize(float f11) {
        this.f9800e = f11;
        a aVar = this.f9798c;
        if (aVar != null) {
            aVar.d((int) f11);
        }
    }

    public void setZIndex(float f11) {
        this.f9801f = f11;
        TileOverlay tileOverlay = this.f9797b;
        if (tileOverlay != null) {
            tileOverlay.setZIndex(f11);
        }
    }
}