package com.course.video_course.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAspect {
  // Todas los metodos de todas las clases dentro del package genre
  @Before("execution(* com.course.video_course.genre..*(..))")
  void before(JoinPoint joinPoint) {
    System.out.println("Before: ");
    System.out.println(joinPoint.getSignature().getName());
  }

  // Todos los metodos dentro de la clase GenreController
  @After("execution(* com.course.video_course.genre.GenreController.*(..))")
  void after(JoinPoint joinPoint) {
    System.out.println("After: ");
    System.err.println(joinPoint.getArgs());
  }
}
