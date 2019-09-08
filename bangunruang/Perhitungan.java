package bangunruang;

class Perhitungan {

    Double luasKerucut( Double s, Double s2) {
        return 3.14 * s * (s + s2);
    }

    Double luasKubus(Double s) {
        return 6 * s * s;
    }

    Double luasBalok(Double s, Double s2, Double s3) {
        return 2 * (s*s2 + s*s3 + s2*s3 );
    }

    Double volumeKubus(Double s) {
        return s * s * s;
    }

    Double volumeKerucut(Double s, Double s2) {
        return  (s * s2)/3;
    }
    Double volumeBalok(Double s, Double s2, Double s3) {
        return s * s2 * s3;
    }

}
