package com.revature.models;

public class Identity {
    private String ssn;
    private String dateOfBirth; //no I won't use a date, stop asking

    public Identity(String ssn, String dateOfBirth) {
        this.ssn = ssn;
        this.dateOfBirth = dateOfBirth;
    }

    public Identity() {
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Identity{" +
                "ssn='" + ssn + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Identity identity = (Identity) o;

        if (ssn != null ? !ssn.equals(identity.ssn) : identity.ssn != null) return false;
        return dateOfBirth != null ? dateOfBirth.equals(identity.dateOfBirth) : identity.dateOfBirth == null;
    }

    @Override
    public int hashCode() {
        int result = ssn != null ? ssn.hashCode() : 0;
        result = 31 * result + (dateOfBirth != null ? dateOfBirth.hashCode() : 0);
        return result;
    }
}
