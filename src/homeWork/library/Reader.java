package homeWork.library;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mykhailov on 02.06.2016.
 */
public class Reader implements Comparable {

    private String nameReader;
    private String surnameReader;
    private String address;
    private String phone;
    private  boolean readerBlackList ;

    private List<Issue> readerList;

    public Reader() {

    }

    public Reader(boolean readerBlackList) {
        this.readerBlackList = readerBlackList;
    }

    public Reader(String nameReader, String surnameReader, String address, String phone) {
        this.nameReader = nameReader;
        this.readerList = new ArrayList<>();
        this.surnameReader = surnameReader;
        this.address = address;
        this.phone = phone;
    }

    public String getNameReader() {
        return nameReader;
    }

    public String getSurnameReader() {
        return surnameReader;
    }


    public String getAddress() {
        return address;
    }


    public String getPhone() {
        return phone;
    }

    public List<Issue> getReaderList() {
        return readerList;
    }

    public boolean isReaderBlackList() {
        return readerBlackList;
    }

    public void setReaderBlackList(boolean readerBlackList) {
        this.readerBlackList = readerBlackList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Reader reader = (Reader) o;

        if (isReaderBlackList() != reader.isReaderBlackList()) return false;
        if (getNameReader() != null ? !getNameReader().equals(reader.getNameReader()) : reader.getNameReader() != null)
            return false;
        if (getSurnameReader() != null ? !getSurnameReader().equals(reader.getSurnameReader()) : reader.getSurnameReader() != null)
            return false;
        if (getAddress() != null ? !getAddress().equals(reader.getAddress()) : reader.getAddress() != null)
            return false;
        if (getPhone() != null ? !getPhone().equals(reader.getPhone()) : reader.getPhone() != null) return false;
        return getReaderList() != null ? getReaderList().equals(reader.getReaderList()) : reader.getReaderList() == null;

    }

    @Override
    public int hashCode() {
        int result = getNameReader() != null ? getNameReader().hashCode() : 0;
        result = 31 * result + (getSurnameReader() != null ? getSurnameReader().hashCode() : 0);
        result = 31 * result + (getAddress() != null ? getAddress().hashCode() : 0);
        result = 31 * result + (getPhone() != null ? getPhone().hashCode() : 0);
        result = 31 * result + (isReaderBlackList() ? 1 : 0);
        result = 31 * result + (getReaderList() != null ? getReaderList().hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(Object o) {
        if (this == o) return 0;
        if (o != null && o instanceof Reader) {

        } else {
            Reader tmp = (Reader) o;
            if (!this.nameReader.equals(tmp.nameReader)) {
                return this.nameReader.compareTo(tmp.nameReader);
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        return String.format("Reader - %1$s, %2$s, %3$s, phone - %4$s",
                nameReader, surnameReader, address, phone);
    }
}

