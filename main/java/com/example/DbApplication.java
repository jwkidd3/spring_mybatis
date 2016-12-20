package com.example;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.javatunes.domain.MusicItem;

import sample.mybatis.mapper.MusicItemMapper;

@SpringBootApplication
@MapperScan("sample.mybatis.mapper")
public class DbApplication {
	@Autowired
	private MusicItemMapper itemMapper;

	public static void main(String[] args) {
		SpringApplication.run(DbApplication.class, args);
	}

	public void run(String... args) throws Exception {
		List<MusicItem> items = this.itemMapper.findByCat("Pop");
		for (MusicItem musicItem : items) {
			System.out.println(musicItem);
		}
	}

}
