#include <avr/io.h>
#include <avr/interrupt.h>

//Пример 1 Кнопку к D2 и по usb к ПК

/*ISR (INT0_vect)
{
	UDR0 = 0x3E;
	
}
int main(void)
{
	sei();
	EICRA = 0x03;
	EIMSK = 0x01;
	DDRD = 0x00;
	PORTD = 0x04;
	UBRR0 = 103;
	UCSR0B = (1<<TXEN0);
	UCSR0C = (1<<UCSZ01)|(1<<UCSZ00);
	while (1)
	{
	}
}*/
//Задание 1 Анализатор к d0 и вывод символа @

/*ISR (INT0_vect)
{
	UDR0 = 0x40;
}
int main(void)
{
	sei();
	EICRA = 0x03;
	EIMSK = 0x01;
	PORTD = 0x04;
	UBRR0 = 103;
	UCSR0B = (1<<TXEN0);
	UCSR0C = (1<<UCSZ01)|(1<<UCSZ00);
	while (1)
	{
	}
}*/
//Задание 2
/*

char msg[15] = {'a','r','d','u','i','n','o','\n'};
int counter = 0;
ISR(USART_TX_vect){
	if (counter <= 13){
	UDR0 = msg[counter]; //Отправляем символы
	counter++;
	} else {
		UDR0 = 0x0A; //Переход на новую строку
		counter = 0;
	}
}

int main(void){
	
	sei();
	UBRR0 = 103;
	UCSR0B |= (1<<TXEN0);
	UCSR0C = (1<<UCSZ01)|(1<<UCSZ00);
	UCSR0B |= (1<<TXCIE0);
	UDR0 = 0x40;
	
	while(1){
	
	
	}
} */

//Задание 3
int flag = 0;
ISR(USART_RX_vect){
	if(UDR0 == 0x32 && flag == 0){
		PORTB |= 0x20;
		flag = 1;
	}else{ 
		if(UDR0 != 0x32 && flag == 1)
		PORTB &= 0xDF;
		flag = 0;
	}
}

int main(void){
	
	sei();
	UBRR0 = 103;
	UCSR0B |= (1<<RXEN0);
	UCSR0C = (1<<UCSZ01)|(1<<UCSZ00);
	UCSR0B |= (1<<RXCIE0);//Включаем прием
	
	DDRB = 0x20;
	PORTB = 0x00;
	while(1){
		
	}
}
/*

char msg[4];
int counter = 0;

ISR(USART_RX_vect){			//Получение сообщения
	if (UDR0 == 0x2E){
		counter = -1;
		UCSR0B ^= 0x18;		//переключение на отправление
	}
	else if (UDR0 != 0x21){
		msg[counter] = UDR0;
		counter++;
	}
}

ISR(USART_TX_vect){				//Отправка сообщения
	if (counter >= 0){
		if (counter == 4) {
			counter = 0;
			UDR0 = 0x2E;
			UCSR0B ^= 0x18;		//переключение на прием
		}
		else if (counter % 2 == 0){
			UDR0 = msg[counter+1];
			} else {
			UDR0 = msg[counter-1];
		}
	} else UDR0 = 0x21;
	counter++;
}

int main(void){
	sei();
	UBRR0 = 103;
	UCSR0B |= (1<<RXEN0);
	UCSR0C = (1<<UCSZ01)|(1<<UCSZ00);
	UCSR0B |= (1<<TXCIE0)|(1<<RXCIE0);
		//переключение на отправление
		
	while(1){
	}
}*/
