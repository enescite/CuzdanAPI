package com.kartim;


public class CuzdanApi
{

        private Cuzdan cuzdan;

        public CuzdanApi() {
            this.cuzdan = new Cuzdan();
        }

        public void cuzdanaParaYukle(double miktar) {
            cuzdan.cuzdanaParaYukle(miktar);
        }

        public void cuzdandanParaHarca(double miktar) {
            cuzdan.cuzdandanParaHarca(miktar);
        }

        public double cuzdanBakiyesiSorgula() {
            return cuzdan.bakiyeSorgula();
        }

}
