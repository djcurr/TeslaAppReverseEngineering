package com.canhub.cropper;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.canhub.cropper.CropImageView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes.dex */
public class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();
    public int A;
    public int B;
    public int C;
    public int E;
    public int F;
    public int G;
    public int H;
    public CharSequence K;
    public int L;
    public Uri O;
    public Bitmap.CompressFormat P;
    public int Q;
    public boolean Q1;
    public int R;
    public int T;
    public int V1;
    public CropImageView.j Y;

    /* renamed from: a */
    public CropImageView.c f10981a;

    /* renamed from: b */
    public float f10982b;

    /* renamed from: b1 */
    public boolean f10983b1;

    /* renamed from: b2 */
    public boolean f10984b2;

    /* renamed from: c */
    public float f10985c;

    /* renamed from: d */
    public CropImageView.d f10986d;

    /* renamed from: e */
    public CropImageView.k f10987e;

    /* renamed from: f */
    public boolean f10988f;

    /* renamed from: g */
    public boolean f10989g;

    /* renamed from: g1 */
    public Rect f10990g1;

    /* renamed from: g2 */
    public boolean f10991g2;

    /* renamed from: h */
    public boolean f10992h;

    /* renamed from: i */
    public boolean f10993i;

    /* renamed from: j */
    public int f10994j;

    /* renamed from: k */
    public float f10995k;

    /* renamed from: l */
    public boolean f10996l;

    /* renamed from: m */
    public int f10997m;

    /* renamed from: n */
    public int f10998n;

    /* renamed from: o */
    public float f10999o;

    /* renamed from: p */
    public int f11000p;

    /* renamed from: p1 */
    public int f11001p1;

    /* renamed from: p2 */
    public CharSequence f11002p2;

    /* renamed from: q */
    public float f11003q;

    /* renamed from: t */
    public float f11004t;

    /* renamed from: w */
    public float f11005w;

    /* renamed from: x */
    public int f11006x;

    /* renamed from: x1 */
    public boolean f11007x1;

    /* renamed from: x2 */
    public int f11008x2;

    /* renamed from: y */
    public float f11009y;

    /* renamed from: y1 */
    public boolean f11010y1;

    /* renamed from: z */
    public int f11011z;

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator<e> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public e[] newArray(int i11) {
            return new e[i11];
        }
    }

    public e() {
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        this.f10981a = CropImageView.c.RECTANGLE;
        this.f10982b = TypedValue.applyDimension(1, 3.0f, displayMetrics);
        this.f10985c = TypedValue.applyDimension(1, 24.0f, displayMetrics);
        this.f10986d = CropImageView.d.ON_TOUCH;
        this.f10987e = CropImageView.k.FIT_CENTER;
        this.f10988f = true;
        this.f10989g = true;
        this.f10992h = true;
        this.f10993i = false;
        this.f10994j = 4;
        this.f10995k = 0.1f;
        this.f10996l = false;
        this.f10997m = 1;
        this.f10998n = 1;
        this.f10999o = TypedValue.applyDimension(1, 3.0f, displayMetrics);
        this.f11000p = Color.argb((int) CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, 255, 255, 255);
        this.f11003q = TypedValue.applyDimension(1, 2.0f, displayMetrics);
        this.f11004t = TypedValue.applyDimension(1, 5.0f, displayMetrics);
        this.f11005w = TypedValue.applyDimension(1, 14.0f, displayMetrics);
        this.f11006x = -1;
        this.f11009y = TypedValue.applyDimension(1, 1.0f, displayMetrics);
        this.f11011z = Color.argb((int) CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, 255, 255, 255);
        this.A = Color.argb(119, 0, 0, 0);
        this.B = (int) TypedValue.applyDimension(1, 42.0f, displayMetrics);
        this.C = (int) TypedValue.applyDimension(1, 42.0f, displayMetrics);
        this.E = 40;
        this.F = 40;
        this.G = 99999;
        this.H = 99999;
        this.K = "";
        this.L = 0;
        this.O = Uri.EMPTY;
        this.P = Bitmap.CompressFormat.JPEG;
        this.Q = 90;
        this.R = 0;
        this.T = 0;
        this.Y = CropImageView.j.NONE;
        this.f10983b1 = false;
        this.f10990g1 = null;
        this.f11001p1 = -1;
        this.f11007x1 = true;
        this.f11010y1 = true;
        this.Q1 = false;
        this.V1 = 90;
        this.f10984b2 = false;
        this.f10991g2 = false;
        this.f11002p2 = null;
        this.f11008x2 = 0;
    }

    public void a() {
        if (this.f10994j >= 0) {
            if (this.f10985c >= BitmapDescriptorFactory.HUE_RED) {
                float f11 = this.f10995k;
                if (f11 >= BitmapDescriptorFactory.HUE_RED && f11 < 0.5d) {
                    if (this.f10997m > 0) {
                        if (this.f10998n > 0) {
                            if (this.f10999o >= BitmapDescriptorFactory.HUE_RED) {
                                if (this.f11003q >= BitmapDescriptorFactory.HUE_RED) {
                                    if (this.f11009y >= BitmapDescriptorFactory.HUE_RED) {
                                        if (this.C >= 0) {
                                            int i11 = this.E;
                                            if (i11 >= 0) {
                                                int i12 = this.F;
                                                if (i12 >= 0) {
                                                    if (this.G >= i11) {
                                                        if (this.H >= i12) {
                                                            if (this.R >= 0) {
                                                                if (this.T >= 0) {
                                                                    int i13 = this.V1;
                                                                    if (i13 < 0 || i13 > 360) {
                                                                        throw new IllegalArgumentException("Cannot set rotation degrees value to a number < 0 or > 360");
                                                                    }
                                                                    return;
                                                                }
                                                                throw new IllegalArgumentException("Cannot set request height value to a number < 0 ");
                                                            }
                                                            throw new IllegalArgumentException("Cannot set request width value to a number < 0 ");
                                                        }
                                                        throw new IllegalArgumentException("Cannot set max crop result height to smaller value than min crop result height");
                                                    }
                                                    throw new IllegalArgumentException("Cannot set max crop result width to smaller value than min crop result width");
                                                }
                                                throw new IllegalArgumentException("Cannot set min crop result height value to a number < 0 ");
                                            }
                                            throw new IllegalArgumentException("Cannot set min crop result width value to a number < 0 ");
                                        }
                                        throw new IllegalArgumentException("Cannot set min crop window height value to a number < 0 ");
                                    }
                                    throw new IllegalArgumentException("Cannot set guidelines thickness value to a number less than 0.");
                                }
                                throw new IllegalArgumentException("Cannot set corner thickness value to a number less than 0.");
                            }
                            throw new IllegalArgumentException("Cannot set line thickness value to a number less than 0.");
                        }
                        throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
                    }
                    throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
                }
                throw new IllegalArgumentException("Cannot set initial crop window padding value to a number < 0 or >= 0.5");
            }
            throw new IllegalArgumentException("Cannot set touch radius value to a number <= 0 ");
        }
        throw new IllegalArgumentException("Cannot set max zoom to a number < 1");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f10981a.ordinal());
        parcel.writeFloat(this.f10982b);
        parcel.writeFloat(this.f10985c);
        parcel.writeInt(this.f10986d.ordinal());
        parcel.writeInt(this.f10987e.ordinal());
        parcel.writeByte(this.f10988f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f10989g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f10992h ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f10993i ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f10994j);
        parcel.writeFloat(this.f10995k);
        parcel.writeByte(this.f10996l ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f10997m);
        parcel.writeInt(this.f10998n);
        parcel.writeFloat(this.f10999o);
        parcel.writeInt(this.f11000p);
        parcel.writeFloat(this.f11003q);
        parcel.writeFloat(this.f11004t);
        parcel.writeFloat(this.f11005w);
        parcel.writeInt(this.f11006x);
        parcel.writeFloat(this.f11009y);
        parcel.writeInt(this.f11011z);
        parcel.writeInt(this.A);
        parcel.writeInt(this.B);
        parcel.writeInt(this.C);
        parcel.writeInt(this.E);
        parcel.writeInt(this.F);
        parcel.writeInt(this.G);
        parcel.writeInt(this.H);
        TextUtils.writeToParcel(this.K, parcel, i11);
        parcel.writeInt(this.L);
        parcel.writeParcelable(this.O, i11);
        parcel.writeString(this.P.name());
        parcel.writeInt(this.Q);
        parcel.writeInt(this.R);
        parcel.writeInt(this.T);
        parcel.writeInt(this.Y.ordinal());
        parcel.writeInt(this.f10983b1 ? 1 : 0);
        parcel.writeParcelable(this.f10990g1, i11);
        parcel.writeInt(this.f11001p1);
        parcel.writeByte(this.f11007x1 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f11010y1 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.Q1 ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.V1);
        parcel.writeByte(this.f10984b2 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f10991g2 ? (byte) 1 : (byte) 0);
        TextUtils.writeToParcel(this.f11002p2, parcel, i11);
        parcel.writeInt(this.f11008x2);
    }

    protected e(Parcel parcel) {
        this.f10981a = CropImageView.c.values()[parcel.readInt()];
        this.f10982b = parcel.readFloat();
        this.f10985c = parcel.readFloat();
        this.f10986d = CropImageView.d.values()[parcel.readInt()];
        this.f10987e = CropImageView.k.values()[parcel.readInt()];
        this.f10988f = parcel.readByte() != 0;
        this.f10989g = parcel.readByte() != 0;
        this.f10992h = parcel.readByte() != 0;
        this.f10993i = parcel.readByte() != 0;
        this.f10994j = parcel.readInt();
        this.f10995k = parcel.readFloat();
        this.f10996l = parcel.readByte() != 0;
        this.f10997m = parcel.readInt();
        this.f10998n = parcel.readInt();
        this.f10999o = parcel.readFloat();
        this.f11000p = parcel.readInt();
        this.f11003q = parcel.readFloat();
        this.f11004t = parcel.readFloat();
        this.f11005w = parcel.readFloat();
        this.f11006x = parcel.readInt();
        this.f11009y = parcel.readFloat();
        this.f11011z = parcel.readInt();
        this.A = parcel.readInt();
        this.B = parcel.readInt();
        this.C = parcel.readInt();
        this.E = parcel.readInt();
        this.F = parcel.readInt();
        this.G = parcel.readInt();
        this.H = parcel.readInt();
        this.K = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.L = parcel.readInt();
        this.O = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.P = Bitmap.CompressFormat.valueOf(parcel.readString());
        this.Q = parcel.readInt();
        this.R = parcel.readInt();
        this.T = parcel.readInt();
        this.Y = CropImageView.j.values()[parcel.readInt()];
        this.f10983b1 = parcel.readByte() != 0;
        this.f10990g1 = (Rect) parcel.readParcelable(Rect.class.getClassLoader());
        this.f11001p1 = parcel.readInt();
        this.f11007x1 = parcel.readByte() != 0;
        this.f11010y1 = parcel.readByte() != 0;
        this.Q1 = parcel.readByte() != 0;
        this.V1 = parcel.readInt();
        this.f10984b2 = parcel.readByte() != 0;
        this.f10991g2 = parcel.readByte() != 0;
        this.f11002p2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f11008x2 = parcel.readInt();
    }
}