package com.caseyellow.server.central.domain.test.services;

import com.caseyellow.server.central.domain.test.model.FailedTest;
import com.caseyellow.server.central.domain.test.model.PreSignedUrl;
import com.caseyellow.server.central.domain.test.model.Test;
import com.caseyellow.server.central.domain.test.model.UserDetails;
import com.caseyellow.server.central.persistence.test.model.LastUserTest;

import java.util.List;
import java.util.Map;

/**
 * Created by dango on 8/15/17.
 */
public interface TestService {
    void saveTest(Test test);
    void saveUserDetails(UserDetails userDetails);
    void saveFailedTest(FailedTest failedTest);
    long userLastTest(String user);
    long userLastFailedTest(String user);
    boolean isUserExist(String userName);
    PreSignedUrl generatePreSignedUrl(String fileKey);
    List<Test> getAllTests();
    List<Test> getAllTestsByUser(String user);
    List<FailedTest> getAllUserFailedTests(String user);
    Map<String, List<String>> getConnectionDetails();
    Map<String,Long> countUserTests();
    List<LastUserTest> lastUserTests();
    int getTestLifeCycle(String userName);
    void updateTestLifeCycle(String userName);
    long userConnectionCount(String user, String connection);
}
