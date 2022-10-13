package helloo.helloospring;

import helloo.helloospring.aop.TimeTraceAop;
import helloo.helloospring.repository.JpaMemberRepository;
import helloo.helloospring.repository.MemberRepository;
import helloo.helloospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    private DataSource dataSource;


    private final MemberRepository memberRepository;

    @Autowired
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository);
    }



//    @Bean
//    public MemberRepository memberRepository() {
////        return new MemoryMemberRepository();
////        return new JdbcMemberRepository(dataSource);
////        return new JdbcMemberRepository(dataSource);
//        return new JpaMemberRepository(em);
//    }
}
