public static int vayVon(float &diemHocTap, int &diemRenLuyen, String &hoanCanh) {

    int ketqua = -1;

    if (diemHocTap < 0 || diemHocTap > 4 || diemRenLuyen < 0) {

        ketqua = -1;

    } else if (diemHocTap < 2.0 || diemRenLuyen < 70) {

        ketqua = 0;

    } else {

        if ( hoanCanh.equals("ho ngheo") || hoanCanh.equals("dan toc thieu so" )) ketqua = 10000000;

        else ketqua = 500000;
    }

    return ketqua;
}