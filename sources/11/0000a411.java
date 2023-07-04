package org.spongycastle.pqc.crypto.sphincs;

/* loaded from: classes4.dex */
class Tree {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class leafaddr {
        int level;
        long subleaf;
        long subtree;

        public leafaddr() {
        }

        public leafaddr(leafaddr leafaddrVar) {
            this.level = leafaddrVar.level;
            this.subtree = leafaddrVar.subtree;
            this.subleaf = leafaddrVar.subleaf;
        }
    }

    Tree() {
    }

    static void gen_leaf_wots(HashFunctions hashFunctions, byte[] bArr, int i11, byte[] bArr2, int i12, byte[] bArr3, leafaddr leafaddrVar) {
        byte[] bArr4 = new byte[32];
        byte[] bArr5 = new byte[2144];
        Wots wots = new Wots();
        Seed.get_seed(hashFunctions, bArr4, 0, bArr3, leafaddrVar);
        wots.wots_pkgen(hashFunctions, bArr5, 0, bArr4, 0, bArr2, i12);
        l_tree(hashFunctions, bArr, i11, bArr5, 0, bArr2, i12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void l_tree(HashFunctions hashFunctions, byte[] bArr, int i11, byte[] bArr2, int i12, byte[] bArr3, int i13) {
        int i14;
        int i15 = 67;
        for (int i16 = 0; i16 < 7; i16++) {
            int i17 = 0;
            while (true) {
                i14 = i15 >>> 1;
                if (i17 >= i14) {
                    break;
                }
                hashFunctions.hash_2n_n_mask(bArr2, i12 + (i17 * 32), bArr2, i12 + (i17 * 2 * 32), bArr3, i13 + (i16 * 2 * 32));
                i17++;
            }
            if ((i15 & 1) != 0) {
                System.arraycopy(bArr2, i12 + ((i15 - 1) * 32), bArr2, (i14 * 32) + i12, 32);
                i14++;
            }
            i15 = i14;
        }
        System.arraycopy(bArr2, i12, bArr, i11, 32);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void treehash(HashFunctions hashFunctions, byte[] bArr, int i11, int i12, byte[] bArr2, leafaddr leafaddrVar, byte[] bArr3, int i13) {
        leafaddr leafaddrVar2 = new leafaddr(leafaddrVar);
        int i14 = i12 + 1;
        byte[] bArr4 = new byte[i14 * 32];
        int[] iArr = new int[i14];
        int i15 = 1;
        int i16 = (int) (leafaddrVar2.subleaf + (1 << i12));
        int i17 = 0;
        while (true) {
            int i18 = 32;
            if (leafaddrVar2.subleaf >= i16) {
                break;
            }
            gen_leaf_wots(hashFunctions, bArr4, i17 * 32, bArr3, i13, bArr2, leafaddrVar2);
            iArr[i17] = 0;
            int i19 = i17 + i15;
            while (i19 > i15) {
                int i21 = i19 - 1;
                int i22 = i19 - 2;
                if (iArr[i21] == iArr[i22]) {
                    int i23 = i22 * 32;
                    int i24 = i15;
                    int[] iArr2 = iArr;
                    hashFunctions.hash_2n_n_mask(bArr4, i23, bArr4, i23, bArr3, i13 + ((iArr[i21] + 7) * 2 * i18));
                    iArr2[i22] = iArr2[i22] + i24;
                    i19--;
                    i15 = i24;
                    i18 = i18;
                    i16 = i16;
                    iArr = iArr2;
                }
            }
            leafaddrVar2.subleaf++;
            i17 = i19;
            i15 = i15;
            i16 = i16;
            iArr = iArr;
        }
        for (int i25 = 0; i25 < 32; i25++) {
            bArr[i11 + i25] = bArr4[i25];
        }
    }
}