package com.service;

import com.pojo.Paper;

import java.util.List;

/**
 * @author shkstart
 * @create 2019/4/12 - 12:21
 */
public interface PaperService {
    int addPaper(Paper paper);

    int deletePaperById(long id);

    int updatePaper(Paper paper);

    Paper queryById(long id);

    List<Paper> queryAllPaper();

}
