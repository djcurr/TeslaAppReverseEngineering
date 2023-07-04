package com.proyecto26.inappbrowser;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import tq.a;
import y70.c;

/* loaded from: classes2.dex */
public class ChromeTabsManagerActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    private boolean f19994a = false;

    /* renamed from: b  reason: collision with root package name */
    private String f19995b = null;

    /* renamed from: c  reason: collision with root package name */
    private boolean f19996c = false;

    private static Intent a(Context context) {
        return new Intent(context, ChromeTabsManagerActivity.class);
    }

    public static Intent b(Context context) {
        Intent a11 = a(context);
        a11.addFlags(67108864);
        return a11;
    }

    public static Intent c(Context context, Intent intent) {
        Intent a11 = a(context);
        a11.putExtra("browserIntent", intent);
        return a11;
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
            if (getIntent().hasExtra("browserIntent") && (bundle == null || bundle.getString("browserResultType") == null)) {
                Intent intent = (Intent) getIntent().getParcelableExtra("browserIntent");
                intent.addFlags(67108864);
                startActivity(intent);
                this.f19995b = "dismiss";
                return;
            }
            finish();
        } catch (Exception e11) {
            this.f19996c = true;
            c.c().l(new a("Unable to open url.", this.f19995b, Boolean.valueOf(this.f19996c)));
            finish();
            e11.printStackTrace();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        String str = this.f19995b;
        if (str != null) {
            str.hashCode();
            if (!str.equals("cancel")) {
                c.c().l(new a("chrome tabs activity destroyed", "dismiss", Boolean.valueOf(this.f19996c)));
            } else {
                c.c().l(new a("chrome tabs activity closed", this.f19995b, Boolean.valueOf(this.f19996c)));
            }
            this.f19995b = null;
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // android.app.Activity
    protected void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.f19995b = bundle.getString("browserResultType");
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if (!this.f19994a) {
            this.f19994a = true;
            return;
        }
        this.f19995b = "cancel";
        finish();
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        bundle.putString("browserResultType", "dismiss");
        super.onSaveInstanceState(bundle);
    }
}