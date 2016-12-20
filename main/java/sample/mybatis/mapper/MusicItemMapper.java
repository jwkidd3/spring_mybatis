package sample.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.javatunes.domain.MusicItem;

@Mapper
public interface MusicItemMapper {

	@Select("select * from musicitem where MUSICCATEGORY = #{cat}")
	List<MusicItem> findByCat(@Param("cat") String cat);
}