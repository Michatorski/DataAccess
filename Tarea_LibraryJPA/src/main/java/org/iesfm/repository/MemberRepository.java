package org.iesfm.repository;

import org.iesfm.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepository extends JpaRepository<Member, Integer> {

    List<Member> findMemberByName(String name);

    int deleteByNameAndSurname(String name, String surname);
}
