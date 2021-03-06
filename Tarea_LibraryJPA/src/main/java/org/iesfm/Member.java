package org.iesfm;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "member")
public class Member {
    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false, unique = true)
    private String nif;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String surname;

    @OneToMany
    @JoinColumn(name = "member_id", referencedColumnName = "id")
    private List<BookLend> bookLends;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<BookLend> getBookLends() {
        return bookLends;
    }

    public void setBookLends(List<BookLend> bookLends) {
        this.bookLends = bookLends;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return id == member.id &&
                Objects.equals(nif, member.nif) &&
                Objects.equals(name, member.name) &&
                Objects.equals(surname, member.surname) &&
                Objects.equals(bookLends, member.bookLends);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nif, name, surname, bookLends);
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", nif='" + nif + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", bookLends=" + bookLends +
                '}';
    }
}
