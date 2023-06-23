package com.kartim;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CuzdanTest
{   private CuzdanApi cuzdanApi;

    @BeforeEach
    public void setup() {
        cuzdanApi = new CuzdanApi();
    }

    @Test
    public void testCuzdanaParaYukle() {
        cuzdanApi.cuzdanaParaYukle(50.0);
        double bakiye = cuzdanApi.cuzdanBakiyesiSorgula();
        Assertions.assertEquals(50.0, bakiye);
    }

    @Test
    public void testCuzdandanParaHarca() {
        cuzdanApi.cuzdanaParaYukle(100.0);
        cuzdanApi.cuzdandanParaHarca(50.0);
        double bakiye = cuzdanApi.cuzdanBakiyesiSorgula();
        Assertions.assertEquals(50.0, bakiye);
    }

    @Test
    public void testCuzdandanFazlaParaHarca() {
        cuzdanApi.cuzdanaParaYukle(100.0);
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            cuzdanApi.cuzdandanParaHarca(150.0);
        });
    }
    @Test
        public void testCuzdanBakiyesiSorgula() {
            double bakiye = cuzdanApi.cuzdanBakiyesiSorgula();
            Assertions.assertEquals(0.0, bakiye);
        }
    }