package hello.jdbc.repository;

import hello.jdbc.domain.Member;

import java.sql.SQLException;

// 이건 인터페이스의 본래 기능을 상싱함
public interface MemberRepositoryEx {
    // 밑에 보면, 체크 예외 처리가 선언되어 있는데 그 자체가 특정 기술(JDBC)에 의존한 것임
    Member save(Member member) throws SQLException;
    Member findById(String memberId);
    void update(String memberId, int money);
    void delete(String memberId);
}
