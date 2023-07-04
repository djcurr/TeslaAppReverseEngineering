package com.canhub.cropper;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import com.canhub.cropper.CropImageView;
import com.canhub.cropper.d;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/canhub/cropper/CropImageActivity;", "Landroidx/appcompat/app/d;", "Lcom/canhub/cropper/CropImageView$i;", "Lcom/canhub/cropper/CropImageView$e;", "<init>", "()V", "cropper_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes.dex */
public final class CropImageActivity extends androidx.appcompat.app.d implements CropImageView.i, CropImageView.e {

    /* renamed from: a  reason: collision with root package name */
    private Uri f10876a;

    /* renamed from: b  reason: collision with root package name */
    private e f10877b;

    /* renamed from: c  reason: collision with root package name */
    private fb.a f10878c;

    private final void k() {
        e eVar = this.f10877b;
        if (eVar == null) {
            s.x("options");
        }
        if (eVar.f10983b1) {
            o(null, null, 1);
            return;
        }
        Uri l11 = l();
        fb.a aVar = this.f10878c;
        if (aVar == null) {
            s.x("binding");
        }
        CropImageView cropImageView = aVar.f26196b;
        e eVar2 = this.f10877b;
        if (eVar2 == null) {
            s.x("options");
        }
        Bitmap.CompressFormat compressFormat = eVar2.P;
        e eVar3 = this.f10877b;
        if (eVar3 == null) {
            s.x("options");
        }
        int i11 = eVar3.Q;
        e eVar4 = this.f10877b;
        if (eVar4 == null) {
            s.x("options");
        }
        int i12 = eVar4.R;
        e eVar5 = this.f10877b;
        if (eVar5 == null) {
            s.x("options");
        }
        int i13 = eVar5.T;
        e eVar6 = this.f10877b;
        if (eVar6 == null) {
            s.x("options");
        }
        cropImageView.p(l11, compressFormat, i11, i12, i13, eVar6.Y);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a0 A[Catch: IOException -> 0x00ae, TRY_LEAVE, TryCatch #1 {IOException -> 0x00ae, blocks: (B:9:0x0019, B:11:0x001d, B:12:0x0020, B:22:0x003b, B:28:0x00a0, B:27:0x0075, B:15:0x0025, B:25:0x0048), top: B:36:0x0019, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0048 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final android.net.Uri l() {
        /*
            r7 = this;
            java.lang.String r0 = ".cropper.fileprovider"
            java.lang.String r1 = "applicationContext"
            com.canhub.cropper.e r2 = r7.f10877b
            java.lang.String r3 = "options"
            if (r2 != 0) goto Ld
            kotlin.jvm.internal.s.x(r3)
        Ld:
            android.net.Uri r2 = r2.O
            if (r2 == 0) goto L19
            android.net.Uri r4 = android.net.Uri.EMPTY
            boolean r4 = kotlin.jvm.internal.s.c(r2, r4)
            if (r4 == 0) goto Lad
        L19:
            com.canhub.cropper.e r2 = r7.f10877b     // Catch: java.io.IOException -> Lae
            if (r2 != 0) goto L20
            kotlin.jvm.internal.s.x(r3)     // Catch: java.io.IOException -> Lae
        L20:
            android.graphics.Bitmap$CompressFormat r2 = r2.P     // Catch: java.io.IOException -> Lae
            if (r2 != 0) goto L25
            goto L33
        L25:
            int[] r3 = db.a.f23863a     // Catch: java.io.IOException -> Lae
            int r2 = r2.ordinal()     // Catch: java.io.IOException -> Lae
            r2 = r3[r2]     // Catch: java.io.IOException -> Lae
            r3 = 1
            if (r2 == r3) goto L39
            r3 = 2
            if (r2 == r3) goto L36
        L33:
            java.lang.String r2 = ".webp"
            goto L3b
        L36:
            java.lang.String r2 = ".png"
            goto L3b
        L39:
            java.lang.String r2 = ".jpg"
        L3b:
            eb.a r3 = new eb.a     // Catch: java.io.IOException -> Lae
            r3.<init>()     // Catch: java.io.IOException -> Lae
            boolean r3 = r3.b()     // Catch: java.io.IOException -> Lae
            java.lang.String r4 = "cropped"
            if (r3 == 0) goto La0
            android.content.Context r3 = r7.getApplicationContext()     // Catch: java.lang.Exception -> L75
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L75
            r5.<init>()     // Catch: java.lang.Exception -> L75
            android.content.Context r6 = r7.getApplicationContext()     // Catch: java.lang.Exception -> L75
            kotlin.jvm.internal.s.f(r6, r1)     // Catch: java.lang.Exception -> L75
            java.lang.String r6 = r6.getPackageName()     // Catch: java.lang.Exception -> L75
            r5.append(r6)     // Catch: java.lang.Exception -> L75
            r5.append(r0)     // Catch: java.lang.Exception -> L75
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L75
            java.lang.String r6 = android.os.Environment.DIRECTORY_PICTURES     // Catch: java.lang.Exception -> L75
            java.io.File r6 = r7.getExternalFilesDir(r6)     // Catch: java.lang.Exception -> L75
            java.io.File r6 = java.io.File.createTempFile(r4, r2, r6)     // Catch: java.lang.Exception -> L75
            android.net.Uri r0 = androidx.core.content.FileProvider.getUriForFile(r3, r5, r6)     // Catch: java.lang.Exception -> L75
            goto Lac
        L75:
            android.content.Context r3 = r7.getApplicationContext()     // Catch: java.io.IOException -> Lae
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Lae
            r5.<init>()     // Catch: java.io.IOException -> Lae
            android.content.Context r6 = r7.getApplicationContext()     // Catch: java.io.IOException -> Lae
            kotlin.jvm.internal.s.f(r6, r1)     // Catch: java.io.IOException -> Lae
            java.lang.String r1 = r6.getPackageName()     // Catch: java.io.IOException -> Lae
            r5.append(r1)     // Catch: java.io.IOException -> Lae
            r5.append(r0)     // Catch: java.io.IOException -> Lae
            java.lang.String r0 = r5.toString()     // Catch: java.io.IOException -> Lae
            java.io.File r1 = r7.getCacheDir()     // Catch: java.io.IOException -> Lae
            java.io.File r1 = java.io.File.createTempFile(r4, r2, r1)     // Catch: java.io.IOException -> Lae
            android.net.Uri r0 = androidx.core.content.FileProvider.getUriForFile(r3, r0, r1)     // Catch: java.io.IOException -> Lae
            goto Lac
        La0:
            java.io.File r0 = r7.getCacheDir()     // Catch: java.io.IOException -> Lae
            java.io.File r0 = java.io.File.createTempFile(r4, r2, r0)     // Catch: java.io.IOException -> Lae
            android.net.Uri r0 = android.net.Uri.fromFile(r0)     // Catch: java.io.IOException -> Lae
        Lac:
            r2 = r0
        Lad:
            return r2
        Lae:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Failed to create temp file for output image"
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.CropImageActivity.l():android.net.Uri");
    }

    private final Intent m(Uri uri, Exception exc, int i11) {
        fb.a aVar = this.f10878c;
        if (aVar == null) {
            s.x("binding");
        }
        CropImageView cropImageView = aVar.f26196b;
        s.f(cropImageView, "binding.cropImageView");
        Uri imageUri = cropImageView.getImageUri();
        fb.a aVar2 = this.f10878c;
        if (aVar2 == null) {
            s.x("binding");
        }
        CropImageView cropImageView2 = aVar2.f26196b;
        s.f(cropImageView2, "binding.cropImageView");
        float[] cropPoints = cropImageView2.getCropPoints();
        fb.a aVar3 = this.f10878c;
        if (aVar3 == null) {
            s.x("binding");
        }
        CropImageView cropImageView3 = aVar3.f26196b;
        s.f(cropImageView3, "binding.cropImageView");
        Rect cropRect = cropImageView3.getCropRect();
        fb.a aVar4 = this.f10878c;
        if (aVar4 == null) {
            s.x("binding");
        }
        CropImageView cropImageView4 = aVar4.f26196b;
        s.f(cropImageView4, "binding.cropImageView");
        int rotatedDegrees = cropImageView4.getRotatedDegrees();
        fb.a aVar5 = this.f10878c;
        if (aVar5 == null) {
            s.x("binding");
        }
        CropImageView cropImageView5 = aVar5.f26196b;
        s.f(cropImageView5, "binding.cropImageView");
        d.c cVar = new d.c(imageUri, uri, exc, cropPoints, cropRect, rotatedDegrees, cropImageView5.getWholeImageRect(), i11);
        Intent intent = new Intent();
        intent.putExtras(getIntent());
        intent.putExtra("CROP_IMAGE_EXTRA_RESULT", cVar);
        return intent;
    }

    private final void n(int i11) {
        fb.a aVar = this.f10878c;
        if (aVar == null) {
            s.x("binding");
        }
        aVar.f26196b.o(i11);
    }

    private final void o(Uri uri, Exception exc, int i11) {
        setResult(exc != null ? 204 : -1, m(uri, exc, i11));
        finish();
    }

    private final void p() {
        setResult(0);
        finish();
    }

    private final void q(Menu menu, int i11, int i12) {
        Drawable icon;
        MenuItem findItem = menu.findItem(i11);
        if (findItem == null || (icon = findItem.getIcon()) == null) {
            return;
        }
        try {
            icon.mutate();
            icon.setColorFilter(new BlendModeColorFilter(i12, BlendMode.SRC_ATOP));
            findItem.setIcon(icon);
        } catch (Exception e11) {
            Log.w("AIC", "Failed to update menu item color", e11);
        }
    }

    @Override // com.canhub.cropper.CropImageView.e
    public void a(CropImageView view, CropImageView.b result) {
        s.g(view, "view");
        s.g(result, "result");
        o(result.g(), result.c(), result.f());
    }

    @Override // com.canhub.cropper.CropImageView.i
    public void c(CropImageView view, Uri uri, Exception exc) {
        s.g(view, "view");
        s.g(uri, "uri");
        if (exc == null) {
            e eVar = this.f10877b;
            if (eVar == null) {
                s.x("options");
            }
            if (eVar.f10990g1 != null) {
                fb.a aVar = this.f10878c;
                if (aVar == null) {
                    s.x("binding");
                }
                CropImageView cropImageView = aVar.f26196b;
                s.f(cropImageView, "binding.cropImageView");
                e eVar2 = this.f10877b;
                if (eVar2 == null) {
                    s.x("options");
                }
                cropImageView.setCropRect(eVar2.f10990g1);
            }
            e eVar3 = this.f10877b;
            if (eVar3 == null) {
                s.x("options");
            }
            if (eVar3.f11001p1 > -1) {
                fb.a aVar2 = this.f10878c;
                if (aVar2 == null) {
                    s.x("binding");
                }
                CropImageView cropImageView2 = aVar2.f26196b;
                s.f(cropImageView2, "binding.cropImageView");
                e eVar4 = this.f10877b;
                if (eVar4 == null) {
                    s.x("options");
                }
                cropImageView2.setRotatedDegrees(eVar4.f11001p1);
                return;
            }
            return;
        }
        o(null, exc, 1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (i11 == 200) {
            if (i12 == 0) {
                p();
            }
            if (i12 == -1) {
                Uri h11 = d.h(this, intent);
                this.f10876a = h11;
                if (h11 != null && d.k(this, h11) && new eb.a().a()) {
                    requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 201);
                    return;
                }
                fb.a aVar = this.f10878c;
                if (aVar == null) {
                    s.x("binding");
                }
                aVar.f26196b.setImageUriAsync(this.f10876a);
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        p();
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        e eVar;
        CharSequence string;
        super.onCreate(bundle);
        fb.a c11 = fb.a.c(getLayoutInflater());
        s.f(c11, "CropImageActivityBinding.inflate(layoutInflater)");
        this.f10878c = c11;
        if (c11 == null) {
            s.x("binding");
        }
        setContentView(c11.getRoot());
        Bundle bundleExtra = getIntent().getBundleExtra("CROP_IMAGE_EXTRA_BUNDLE");
        this.f10876a = bundleExtra != null ? (Uri) bundleExtra.getParcelable("CROP_IMAGE_EXTRA_SOURCE") : null;
        if (bundleExtra == null || (eVar = (e) bundleExtra.getParcelable("CROP_IMAGE_EXTRA_OPTIONS")) == null) {
            eVar = new e();
        }
        this.f10877b = eVar;
        if (bundle == null) {
            Uri uri = this.f10876a;
            if (uri != null && !s.c(uri, Uri.EMPTY)) {
                Uri uri2 = this.f10876a;
                if (uri2 != null && d.k(this, uri2) && new eb.a().a()) {
                    requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 201);
                } else {
                    fb.a aVar = this.f10878c;
                    if (aVar == null) {
                        s.x("binding");
                    }
                    aVar.f26196b.setImageUriAsync(this.f10876a);
                }
            } else if (d.j(this)) {
                requestPermissions(new String[]{"android.permission.CAMERA"}, 2011);
            } else {
                d.m(this);
            }
        }
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            e eVar2 = this.f10877b;
            if (eVar2 == null) {
                s.x("options");
            }
            if (eVar2.K != null) {
                e eVar3 = this.f10877b;
                if (eVar3 == null) {
                    s.x("options");
                }
                CharSequence charSequence = eVar3.K;
                s.f(charSequence, "options.activityTitle");
                if (charSequence.length() > 0) {
                    e eVar4 = this.f10877b;
                    if (eVar4 == null) {
                        s.x("options");
                    }
                    string = eVar4.K;
                    setTitle(string);
                    supportActionBar.v(true);
                }
            }
            string = getResources().getString(db.f.f23885b);
            setTitle(string);
            supportActionBar.v(true);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        s.g(menu, "menu");
        getMenuInflater().inflate(db.e.f23883a, menu);
        e eVar = this.f10877b;
        if (eVar == null) {
            s.x("options");
        }
        if (!eVar.f11007x1) {
            menu.removeItem(db.c.f23879h);
            menu.removeItem(db.c.f23880i);
        } else {
            e eVar2 = this.f10877b;
            if (eVar2 == null) {
                s.x("options");
            }
            if (eVar2.Q1) {
                MenuItem findItem = menu.findItem(db.c.f23879h);
                s.f(findItem, "menu.findItem(R.id.ic_rotate_left_24)");
                findItem.setVisible(true);
            }
        }
        e eVar3 = this.f10877b;
        if (eVar3 == null) {
            s.x("options");
        }
        if (!eVar3.f11010y1) {
            menu.removeItem(db.c.f23876e);
        }
        e eVar4 = this.f10877b;
        if (eVar4 == null) {
            s.x("options");
        }
        if (eVar4.f11002p2 != null) {
            MenuItem findItem2 = menu.findItem(db.c.f23875d);
            s.f(findItem2, "menu.findItem(R.id.crop_image_menu_crop)");
            e eVar5 = this.f10877b;
            if (eVar5 == null) {
                s.x("options");
            }
            findItem2.setTitle(eVar5.f11002p2);
        }
        Drawable drawable = null;
        try {
            e eVar6 = this.f10877b;
            if (eVar6 == null) {
                s.x("options");
            }
            if (eVar6.f11008x2 != 0) {
                e eVar7 = this.f10877b;
                if (eVar7 == null) {
                    s.x("options");
                }
                drawable = androidx.core.content.b.getDrawable(this, eVar7.f11008x2);
                MenuItem findItem3 = menu.findItem(db.c.f23875d);
                s.f(findItem3, "menu.findItem(R.id.crop_image_menu_crop)");
                findItem3.setIcon(drawable);
            }
        } catch (Exception e11) {
            Log.w("AIC", "Failed to read menu crop drawable", e11);
        }
        e eVar8 = this.f10877b;
        if (eVar8 == null) {
            s.x("options");
        }
        if (eVar8.L != 0) {
            int i11 = db.c.f23879h;
            e eVar9 = this.f10877b;
            if (eVar9 == null) {
                s.x("options");
            }
            q(menu, i11, eVar9.L);
            int i12 = db.c.f23880i;
            e eVar10 = this.f10877b;
            if (eVar10 == null) {
                s.x("options");
            }
            q(menu, i12, eVar10.L);
            int i13 = db.c.f23876e;
            e eVar11 = this.f10877b;
            if (eVar11 == null) {
                s.x("options");
            }
            q(menu, i13, eVar11.L);
            if (drawable != null) {
                int i14 = db.c.f23875d;
                e eVar12 = this.f10877b;
                if (eVar12 == null) {
                    s.x("options");
                }
                q(menu, i14, eVar12.L);
            }
        }
        return true;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        s.g(item, "item");
        int itemId = item.getItemId();
        if (itemId == db.c.f23875d) {
            k();
            return true;
        } else if (itemId == db.c.f23879h) {
            e eVar = this.f10877b;
            if (eVar == null) {
                s.x("options");
            }
            n(-eVar.V1);
            return true;
        } else if (itemId == db.c.f23880i) {
            e eVar2 = this.f10877b;
            if (eVar2 == null) {
                s.x("options");
            }
            n(eVar2.V1);
            return true;
        } else if (itemId == db.c.f23877f) {
            fb.a aVar = this.f10878c;
            if (aVar == null) {
                s.x("binding");
            }
            aVar.f26196b.f();
            return true;
        } else if (itemId != db.c.f23878g) {
            if (itemId == 16908332) {
                p();
                return true;
            }
            return super.onOptionsItemSelected(item);
        } else {
            fb.a aVar2 = this.f10878c;
            if (aVar2 == null) {
                s.x("binding");
            }
            aVar2.f26196b.g();
            return true;
        }
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i11, String[] permissions, int[] grantResults) {
        s.g(permissions, "permissions");
        s.g(grantResults, "grantResults");
        if (i11 == 201) {
            if (this.f10876a != null) {
                if ((!(grantResults.length == 0)) && grantResults[0] == 0) {
                    fb.a aVar = this.f10878c;
                    if (aVar == null) {
                        s.x("binding");
                    }
                    aVar.f26196b.setImageUriAsync(this.f10876a);
                }
            }
            Toast.makeText(this, db.f.f23884a, 1).show();
            p();
        }
        if (i11 == 2011) {
            d.m(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.d, androidx.fragment.app.h, android.app.Activity
    public void onStart() {
        super.onStart();
        fb.a aVar = this.f10878c;
        if (aVar == null) {
            s.x("binding");
        }
        aVar.f26196b.setOnSetImageUriCompleteListener(this);
        fb.a aVar2 = this.f10878c;
        if (aVar2 == null) {
            s.x("binding");
        }
        aVar2.f26196b.setOnCropImageCompleteListener(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.d, androidx.fragment.app.h, android.app.Activity
    public void onStop() {
        super.onStop();
        fb.a aVar = this.f10878c;
        if (aVar == null) {
            s.x("binding");
        }
        aVar.f26196b.setOnSetImageUriCompleteListener(null);
        fb.a aVar2 = this.f10878c;
        if (aVar2 == null) {
            s.x("binding");
        }
        aVar2.f26196b.setOnCropImageCompleteListener(null);
    }
}