package com.example.simpletestassignment

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {

    /* * UNIT TEST CASE 1: Validasi Input Kosong
     * Deskripsi: Mengecek apakah fungsi mengembalikan 'false' jika salah satu input kosong.
     * Alasan: User tidak boleh mendaftar jika data tidak lengkap.
     */
    @Test
    fun `input kosong menghasilkan false`() {
        val result = RegistrationUtil.validateRegistrationInput("", "123456")
        assertThat(result).isFalse()
    }

    /* * UNIT TEST CASE 2: Validasi Panjang Password
     * Deskripsi: Mengecek apakah fungsi mengembalikan 'false' jika password < 6 karakter.
     * Alasan: Untuk keamanan, password minimal harus memiliki panjang tertentu.
     */
    @Test
    fun `password pendek menghasilkan false`() {
        val result = RegistrationUtil.validateRegistrationInput("muadz", "123")
        assertThat(result).isFalse()
    }

}