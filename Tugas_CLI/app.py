from database import cursor, db
from tabulate import tabulate
import os

def clear():
    os.system("cls" if os.name == "nt" else "clear")

def tampil_data():
    clear()
    cursor.execute("SELECT * FROM barang")
    data = cursor.fetchall()

    if len(data) == 0:
        print("\nData masih kosong!")
    else:
        tabel = []
        no = 1
        for row in data:
            tabel.append([no, row[0], row[1], row[2], row[3]])
            no += 1

        print("\nDAFTAR BARANG TOKO RETAIL\n")
        print(tabulate(
            tabel,
            headers=["No", "Kode", "Nama Barang", "Harga", "Stok"],
            tablefmt="grid"
        ))
        print(f"\nTotal : {len(data)} barang")

    input("\nTekan Enter untuk kembali...")

def tambah_data():
    clear()
    print("=== TAMBAH DATA ===")

    kode = input("Kode Barang : ")

    cursor.execute("SELECT * FROM barang WHERE kode=%s", (kode,))
    if cursor.fetchone():
        print("\nKode sudah ada!")
        input("Tekan Enter...")
        return

    nama = input("Nama Barang : ")
    harga = int(input("Harga : "))
    stok = int(input("Stok : "))

    sql = """
    INSERT INTO barang(kode,nama_barang,harga,stok)
    VALUES(%s,%s,%s,%s)
    """

    cursor.execute(sql, (kode, nama, harga, stok))
    db.commit()

    print("\nData berhasil ditambahkan.")
    input("Tekan Enter...")

def cari_data():
    clear()
    print("=== CARI DATA ===")

    kode = input("Masukkan Kode Barang : ")

    cursor.execute("SELECT * FROM barang WHERE kode=%s", (kode,))
    data = cursor.fetchone()

    if data:
        print("\nData ditemukan\n")
        print(f"Kode  : {data[0]}")
        print(f"Nama  : {data[1]}")
        print(f"Harga : {data[2]}")
        print(f"Stok  : {data[3]}")
    else:
        print("\nData tidak ditemukan!")

    input("\nTekan Enter...")

def ubah_data():
    clear()
    print("=== UBAH DATA ===")

    kode = input("Masukkan Kode Barang : ")

    cursor.execute("SELECT * FROM barang WHERE kode=%s", (kode,))
    data = cursor.fetchone()

    if not data:
        print("\nData tidak ditemukan!")
        input("Tekan Enter...")
        return

    print("\nData Lama")
    print("Nama :", data[1])
    print("Harga:", data[2])
    print("Stok :", data[3])

    nama = input("\nNama Baru : ")
    harga = int(input("Harga Baru : "))
    stok = int(input("Stok Baru : "))

    sql = """
    UPDATE barang
    SET nama_barang=%s,
        harga=%s,
        stok=%s
    WHERE kode=%s
    """

    cursor.execute(sql, (nama, harga, stok, kode))
    db.commit()

    print("\nData berhasil diubah.")
    input("Tekan Enter...")

def hapus_data():
    clear()
    print("=== HAPUS DATA ===")

    kode = input("Masukkan Kode Barang : ")

    cursor.execute("SELECT * FROM barang WHERE kode=%s", (kode,))
    data = cursor.fetchone()

    if not data:
        print("\nData tidak ditemukan!")
        input("Tekan Enter...")
        return

    yakin = input("Yakin ingin menghapus? (y/t) : ")

    if yakin.lower() == "y":
        cursor.execute("DELETE FROM barang WHERE kode=%s", (kode,))
        db.commit()
        print("\nData berhasil dihapus.")
    else:
        print("\nPenghapusan dibatalkan.")

    input("Tekan Enter...")

while True:
    clear()

    print("=" * 35)
    print("      MENU TOKO RETAIL")
    print("=" * 35)
    print("1. Tampil Semua Data")
    print("2. Tambah Data")
    print("3. Cari Data")
    print("4. Ubah Data")
    print("5. Hapus Data")
    print("0. Keluar")
    print("=" * 35)

    pilih = input("Pilihan : ")

    if pilih == "1":
        tampil_data()
    elif pilih == "2":
        tambah_data()
    elif pilih == "3":
        cari_data()
    elif pilih == "4":
        ubah_data()
    elif pilih == "5":
        hapus_data()
    elif pilih == "0":
        print("\nTerima kasih.")
        break
    else:
        print("\nMenu tidak tersedia.")
        input("Tekan Enter...")