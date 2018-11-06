package kr.or.ddit.file.util;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import kr.or.ddit.hello.HelloControllerTest;

public class FileUtilTest {
	
	private Logger logger = LoggerFactory.getLogger(FileUtilTest.class);

	//테스트 코드를 운영코드보다 먼저 작성하는 방법
	// Test Driven Development(TDD)
	
	//확장자가 있는 경우
	@Test
	public void getFileExtExistTest() {
		/***Given***/
		String fileName = "sally.png";
		
		/***When***/
		String ext = FileUtil.getFileExt(fileName);

		/***Then***/
		assertEquals(".png", ext);
	}
	
	//확장자가 없는 경우
	@Test
	public void getFileExtTest() {
		/***Given***/
		String fileName = "sally";
		
		/***When***/
		String ext = FileUtil.getFileExt(fileName);
		
		/***Then***/
		assertEquals("", ext);
	}
	
	@Test
	public void getFileExtMultiBotTest() {
		/***Given***/
		String fileName = "sally.do.png";
		
		/***When***/
		String ext = FileUtil.getFileExt(fileName);
		
		/***Then***/
		assertEquals(".png", ext);
	}

}
