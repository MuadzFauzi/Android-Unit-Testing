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
     * Tujuan: Memastikan fungsi mengembalikan 'false' jika password kurang dari 6 karakter.
     * Alasan: Keamanan akun minimal memerlukan 6 karakter untuk mengurangi risiko keamanan sederhana.
     *//* * UNIT TEST CASE 2: Validasi Panjang Password
     * Tujuan: Memastikan fungsi mengembalikan 'false' jika password kurang dari 6 karakter.
     * Alasan: Keamanan akun minimal memerlukan 6 karakter untuk mengurangi risiko keamanan sederhana.
     */
    @Test
    fun `password pendek menghasilkan false`() {
        val result = RegistrationUtil.validateRegistrationInput("muadz", "123")
        assertThat(result).isFalse()
    }

}