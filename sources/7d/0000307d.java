package com.google.android.gms.vision.text;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.util.SparseArray;
import com.google.android.gms.internal.vision.zzae;
import com.google.android.gms.internal.vision.zzag;
import com.google.android.gms.internal.vision.zzak;
import com.google.android.gms.internal.vision.zzal;
import com.google.android.gms.internal.vision.zzn;
import com.google.android.gms.internal.vision.zzp;
import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.Frame;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class TextRecognizer extends Detector<TextBlock> {
    private final zzak zzez;

    /* loaded from: classes3.dex */
    public static class Builder {
        private Context zze;
        private zzal zzfa = new zzal();

        public Builder(Context context) {
            this.zze = context;
        }

        public TextRecognizer build() {
            return new TextRecognizer(new zzak(this.zze, this.zzfa));
        }
    }

    private TextRecognizer() {
        throw new IllegalStateException("Default constructor called");
    }

    @Override // com.google.android.gms.vision.Detector
    public final SparseArray<TextBlock> detect(Frame frame) {
        byte[] bArr;
        Bitmap decodeByteArray;
        zzag zzagVar = new zzag(new Rect());
        if (frame != null) {
            zzn zzc = zzn.zzc(frame);
            if (frame.getBitmap() != null) {
                decodeByteArray = frame.getBitmap();
            } else {
                Frame.Metadata metadata = frame.getMetadata();
                ByteBuffer grayscaleImageData = frame.getGrayscaleImageData();
                int format = metadata.getFormat();
                int i11 = zzc.width;
                int i12 = zzc.height;
                if (grayscaleImageData.hasArray() && grayscaleImageData.arrayOffset() == 0) {
                    bArr = grayscaleImageData.array();
                } else {
                    byte[] bArr2 = new byte[grayscaleImageData.capacity()];
                    grayscaleImageData.get(bArr2);
                    bArr = bArr2;
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                new YuvImage(bArr, format, i11, i12, null).compressToJpeg(new Rect(0, 0, i11, i12), 100, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                decodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
            }
            Bitmap zzb = zzp.zzb(decodeByteArray, zzc);
            if (!zzagVar.zzfl.isEmpty()) {
                Rect rect = zzagVar.zzfl;
                int width = frame.getMetadata().getWidth();
                int height = frame.getMetadata().getHeight();
                int i13 = zzc.rotation;
                if (i13 == 1) {
                    rect = new Rect(height - rect.bottom, rect.left, height - rect.top, rect.right);
                } else if (i13 == 2) {
                    rect = new Rect(width - rect.right, height - rect.bottom, width - rect.left, height - rect.top);
                } else if (i13 == 3) {
                    rect = new Rect(rect.top, width - rect.right, rect.bottom, width - rect.left);
                }
                zzagVar.zzfl.set(rect);
            }
            zzc.rotation = 0;
            zzae[] zza = this.zzez.zza(zzb, zzc, zzagVar);
            SparseArray sparseArray = new SparseArray();
            for (zzae zzaeVar : zza) {
                SparseArray sparseArray2 = (SparseArray) sparseArray.get(zzaeVar.zzfj);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    sparseArray.append(zzaeVar.zzfj, sparseArray2);
                }
                sparseArray2.append(zzaeVar.zzfk, zzaeVar);
            }
            SparseArray<TextBlock> sparseArray3 = new SparseArray<>(sparseArray.size());
            for (int i14 = 0; i14 < sparseArray.size(); i14++) {
                sparseArray3.append(sparseArray.keyAt(i14), new TextBlock((SparseArray) sparseArray.valueAt(i14)));
            }
            return sparseArray3;
        }
        throw new IllegalArgumentException("No frame supplied.");
    }

    @Override // com.google.android.gms.vision.Detector
    public final boolean isOperational() {
        return this.zzez.isOperational();
    }

    @Override // com.google.android.gms.vision.Detector
    public final void release() {
        super.release();
        this.zzez.zzp();
    }

    private TextRecognizer(zzak zzakVar) {
        this.zzez = zzakVar;
    }
}