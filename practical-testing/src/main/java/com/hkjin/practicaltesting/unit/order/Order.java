package com.hkjin.practicaltesting.unit.order;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Getter;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hkjin.practicaltesting.unit.beverate.Beverage;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class Order {
	private final LocalDateTime orderDateTime;
	private final List<Beverage> beverages;
}
