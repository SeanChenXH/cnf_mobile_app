package service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.List;
import java.util.Random;
import mapper.LoginMapper;
import mapper.MuniLoginMapper;
import mapper.OccInspectionMapper;
import model.Login;
import model.MuniLogin;
import model.OccInspection;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import util.SqlSessionFactoryUtils;

public class LoginService {

  SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();

  public Login login(String username, String password) {
    SqlSession session = sqlSessionFactory.openSession();
    LoginMapper mapper = session.getMapper(LoginMapper.class);
    Login login = mapper.select(username, password);
    return login;
  }

}
