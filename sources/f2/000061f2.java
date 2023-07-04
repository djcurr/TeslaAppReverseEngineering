package com.teslamotors.plugins.ble;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.nfc.cardemulation.HostApduService;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import zu.f0;

/* loaded from: classes6.dex */
public class TeslaCardEmulationService extends HostApduService {

    /* renamed from: f  reason: collision with root package name */
    private static final byte[] f22131f = {-112, 0};

    /* renamed from: g  reason: collision with root package name */
    private static final byte[] f22132g = {109, 0};

    /* renamed from: h  reason: collision with root package name */
    private static final byte[] f22133h = {107, 0};

    /* renamed from: b  reason: collision with root package name */
    Messenger f22135b;

    /* renamed from: d  reason: collision with root package name */
    boolean f22137d;

    /* renamed from: a  reason: collision with root package name */
    private final com.tesla.logging.g f22134a = com.tesla.logging.g.g("TeslaCardEmulationService");

    /* renamed from: c  reason: collision with root package name */
    private final Messenger f22136c = new Messenger(new c());

    /* renamed from: e  reason: collision with root package name */
    private final ServiceConnection f22138e = new a();

    /* loaded from: classes6.dex */
    class a implements ServiceConnection {
        a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            TeslaCardEmulationService.this.f22134a.a("onServiceConnected");
            TeslaCardEmulationService.this.f22135b = new Messenger(iBinder);
            TeslaCardEmulationService.this.f22137d = true;
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            TeslaCardEmulationService teslaCardEmulationService = TeslaCardEmulationService.this;
            if (teslaCardEmulationService.f22137d) {
                teslaCardEmulationService.f22137d = false;
                teslaCardEmulationService.f22134a.a("onServiceDisconnected");
            }
            TeslaCardEmulationService.this.f22135b = null;
        }
    }

    /* loaded from: classes6.dex */
    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f22140a;

        static {
            int[] iArr = new int[nv.c.values().length];
            f22140a = iArr;
            try {
                iArr[nv.c.NFCGetPublicKeyBytesInfo.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22140a[nv.c.NFCEncryptWithSharedSecretResponse.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22140a[nv.c.RegisterComplete.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes6.dex */
    class c extends Handler {
        c() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Bundle data = message.getData();
            data.setClassLoader(c.class.getClassLoader());
            int i11 = b.f22140a[nv.c.get(message.what).ordinal()];
            if (i11 == 1) {
                Parcelable parcelable = data.getParcelable(nv.c.NFCGetPublicKeyBytesInfo.getKey());
                if (parcelable != null) {
                    TeslaCardEmulationService.this.e((nv.f) parcelable);
                    return;
                }
                TeslaCardEmulationService.this.f22134a.a("Pub key not ready yet, resend the request");
                Message obtain = Message.obtain();
                obtain.what = nv.c.NFCGetPublicKeyBytes.getWhat();
                sendMessage(obtain);
            } else if (i11 != 2) {
                if (i11 != 3) {
                    return;
                }
                TeslaCardEmulationService.this.f22134a.a("Successfully registered to received callbacks from BLE service");
            } else {
                Parcelable parcelable2 = data.getParcelable(nv.c.NFCEncryptWithSharedSecretResponse.getKey());
                if (parcelable2 != null) {
                    TeslaCardEmulationService.this.d((nv.b) parcelable2);
                } else {
                    TeslaCardEmulationService.this.f22134a.a("NFC auth response not ready yet");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(nv.b bVar) {
        byte[] a11 = bVar.a();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            if (a11 != null) {
                byteArrayOutputStream.write(Arrays.copyOfRange(a11, 0, 16));
                byteArrayOutputStream.write(f22131f);
            } else {
                byteArrayOutputStream.write(g((short) 28442));
            }
        } catch (IOException e11) {
            com.tesla.logging.g gVar = this.f22134a;
            gVar.c("Exception adding encrypted response to the message" + e11.getMessage());
        }
        sendResponseApdu(byteArrayOutputStream.toByteArray());
        com.tesla.logging.g gVar2 = this.f22134a;
        gVar2.a("APDU Response (Get Auth response):" + byteArrayOutputStream.toByteArray().toString());
        com.tesla.logging.g gVar3 = this.f22134a;
        gVar3.a("APDU Response (Get Auth response):Length =" + byteArrayOutputStream.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(nv.f fVar) {
        byte[] a11 = fVar.a();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            if (a11 != null) {
                byteArrayOutputStream.write(a11);
                byteArrayOutputStream.write(f22131f);
            } else {
                byteArrayOutputStream.write(g((short) 28435));
            }
        } catch (IOException e11) {
            com.tesla.logging.g gVar = this.f22134a;
            gVar.c("IOException adding public key to array" + e11.getMessage());
        }
        sendResponseApdu(byteArrayOutputStream.toByteArray());
        com.tesla.logging.g gVar2 = this.f22134a;
        gVar2.a("APDU Response (Get Pub key):" + byteArrayOutputStream.toByteArray().toString());
        com.tesla.logging.g gVar3 = this.f22134a;
        gVar3.a("APDU Response (Get Pub key):Length =" + byteArrayOutputStream.size());
    }

    private boolean f(Message message) {
        Messenger messenger;
        com.tesla.logging.g gVar = this.f22134a;
        gVar.a("Sending message:" + nv.c.getName(message.what));
        boolean z11 = false;
        if (this.f22137d && (messenger = this.f22135b) != null) {
            try {
                message.replyTo = this.f22136c;
                messenger.send(message);
                z11 = true;
                com.tesla.logging.g gVar2 = this.f22134a;
                gVar2.a("Sent to Server from client :" + this.f22135b.toString() + "Reply to " + this.f22136c.toString());
                return true;
            } catch (RemoteException e11) {
                com.tesla.logging.g gVar3 = this.f22134a;
                gVar3.c("Failed to send message - Remote Exception! : " + e11.getMessage());
                return z11;
            }
        }
        this.f22134a.a("Failed to send message - service not bound");
        return false;
    }

    private static byte[] g(short s11) {
        return new byte[]{(byte) (s11 >> 8), (byte) (s11 & 255)};
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f22134a.a("onCreate called");
        bindService(new Intent(this, BLEService.class), this.f22138e, 1);
    }

    @Override // android.nfc.cardemulation.HostApduService
    public void onDeactivated(int i11) {
        com.tesla.logging.g gVar = this.f22134a;
        gVar.a("Deactivated: " + i11);
    }

    @Override // android.app.Service
    public void onDestroy() {
        if (this.f22137d) {
            this.f22137d = false;
        }
        this.f22135b = null;
        unbindService(this.f22138e);
        this.f22134a.a("onDestroy called");
    }

    @Override // android.nfc.cardemulation.HostApduService
    public byte[] processCommandApdu(byte[] bArr, Bundle bundle) {
        this.f22134a.a("Called Tesla Logic applet");
        byte[] bArr2 = f22131f;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte b11 = bArr[1];
        if (b11 == -92) {
            this.f22134a.a("Called to enable Tesla Logic applet");
        } else if (b11 != 4) {
            if (b11 != 17) {
                if (b11 == 20) {
                    try {
                        byteArrayOutputStream.write(g((short) 49));
                    } catch (IOException e11) {
                        com.tesla.logging.g gVar = this.f22134a;
                        gVar.c("Exception when sending form factor" + e11.getMessage());
                    }
                } else if (b11 != 27) {
                    bArr2 = f22132g;
                } else {
                    this.f22134a.a("Got Vehicle Info");
                    if (bArr[4] < 30) {
                        byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr[4] + 5);
                        com.tesla.logging.g gVar2 = this.f22134a;
                        gVar2.a("From Vehicle Protobuf : " + f0.b(copyOfRange));
                        Message obtain = Message.obtain();
                        nv.c cVar = nv.c.NFCProtoMessage;
                        obtain.what = cVar.getWhat();
                        Bundle bundle2 = new Bundle();
                        bundle2.putByteArray(cVar.getKey(), copyOfRange);
                        obtain.setData(bundle2);
                        if (!f(obtain)) {
                            bArr2 = g((short) 28442);
                        }
                    } else {
                        this.f22134a.a("Ignore Vehicle proto, too long info");
                    }
                }
            } else if (bArr[2] != 0) {
                bArr2 = f22133h;
            } else if (bArr[4] != 81) {
                bArr2 = g((short) 28441);
            } else {
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, 70);
                byte[] copyOfRange3 = Arrays.copyOfRange(bArr, 70, 86);
                com.tesla.logging.g gVar3 = this.f22134a;
                gVar3.a("Requested Vehicle Public Key :" + f0.b(copyOfRange2));
                com.tesla.logging.g gVar4 = this.f22134a;
                gVar4.a("Requested Vehicle Token :" + f0.b(copyOfRange3));
                Message obtain2 = Message.obtain();
                nv.c cVar2 = nv.c.NFCEncryptWithSharedSecret;
                obtain2.what = cVar2.getWhat();
                Bundle bundle3 = new Bundle();
                ArrayList<String> arrayList = new ArrayList<>();
                arrayList.add(f0.b(copyOfRange3));
                arrayList.add(f0.b(copyOfRange2));
                bundle3.putStringArrayList(cVar2.getKey(), arrayList);
                obtain2.setData(bundle3);
                if (f(obtain2)) {
                    return null;
                }
                bArr2 = g((short) 28442);
            }
        } else if (bArr[2] != 0) {
            bArr2 = f22133h;
        } else {
            Message obtain3 = Message.obtain();
            obtain3.what = nv.c.NFCGetPublicKeyBytes.getWhat();
            if (f(obtain3)) {
                return null;
            }
            bArr2 = g((short) 28435);
        }
        try {
            byteArrayOutputStream.write(bArr2);
        } catch (IOException e12) {
            com.tesla.logging.g gVar5 = this.f22134a;
            gVar5.c("Exception adding status code" + e12.getMessage());
        }
        com.tesla.logging.g gVar6 = this.f22134a;
        gVar6.a("APDU Response :" + byteArrayOutputStream.toByteArray().toString());
        com.tesla.logging.g gVar7 = this.f22134a;
        gVar7.a("APDU Response :Length =" + byteArrayOutputStream.size());
        return byteArrayOutputStream.toByteArray();
    }
}