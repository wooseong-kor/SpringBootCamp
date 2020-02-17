package com.min.edu.dtos;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QBoardDTO is a Querydsl query type for BoardDTO
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QBoardDTO extends EntityPathBase<BoardDTO> {

    private static final long serialVersionUID = -913526286L;

    public static final QBoardDTO boardDTO = new QBoardDTO("boardDTO");

    public final NumberPath<Long> bnp = createNumber("bnp", Long.class);

    public final StringPath content = createString("content");

    public final DateTimePath<java.sql.Timestamp> regdate = createDateTime("regdate", java.sql.Timestamp.class);

    public final StringPath title = createString("title");

    public final DateTimePath<java.sql.Timestamp> updatedate = createDateTime("updatedate", java.sql.Timestamp.class);

    public final StringPath writer = createString("writer");

    public QBoardDTO(String variable) {
        super(BoardDTO.class, forVariable(variable));
    }

    public QBoardDTO(Path<? extends BoardDTO> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBoardDTO(PathMetadata metadata) {
        super(BoardDTO.class, metadata);
    }

}

