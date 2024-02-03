/*
 * Copyright (c) 2020, <GiacomoSorbi> All rights reserved.
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * 1. Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE. The views and conclusions contained in the
 * software and documentation are those of the authors and should not be
 * interpreted as representing official policies, either expressed or implied,
 * of the FreeBSD Project.
 */

package _02_IntroToQueues;

import java.util.ArrayDeque;

/*
 * Complete the calculateWaitTime() method here!
 * Instructions are in the BaseBallTicketsTest class.
 */

public class _02_BaseballTickets {

    public static int calculateWaitTime2( ArrayDeque<Integer> ticketsQueue, int position ) {
        int min = 0;
        int same = position;
        
        for(int i=0;i<21;i++) {
        	System.out.println(ticketsQueue);
        	System.out.println(position);
        	        	
        	int temp = ticketsQueue.remove();
        	if(temp - 1 > 0) {
	        	ticketsQueue.add(temp - 1);
        	}
        	
        	if(same == 5) {
        		same = 0;
        	}
        	if(temp == 0) {
        		System.out.println("wofjowjfiowejfoiwejf");
    			return min;
    		}
        	        	
        	min++;
        	same++;
        }
        
        return 0;
    }
    
    public static int calculateWaitTime3( ArrayDeque<Integer> ticketsQueue, int position ) {
        int min = 0;
        int same = 5 - position;
        
        for(int i=0;i<21;i++) {
        	System.out.println(ticketsQueue);
        	System.out.println(position);
        	
        	int temp = ticketsQueue.remove() - 1;
        	if(temp > 0) {
	        	ticketsQueue.add(temp);
        	}
        	
        	if(same == 5) {
        		System.out.println(temp);
        		same = 0;
        		if(temp == 1) {
        			System.out.println("iamsdoiasmdoiamdoiasmdasd");
        			System.out.println(min+1);
        			return min+1;
        		}
        	}
        	
        	min++;
        	same++;
        }
        
        return 0;
    }
    
    public static int calculateWaitTime( ArrayDeque<Integer> ticketsQueue, int position ) {
    	int same = position+1;
    	int loop = 1;
    	int temp = 100;
    	
    	for(int i=0;i<21;i++) {
    		System.out.println(ticketsQueue);
    		System.out.println(same + " " + position);
    		if(same == loop) {
    			same = 6-loop;
    			System.out.println("same" + loop);
    		}
    		else {
    			same--;
    		}
    		
    		temp = ticketsQueue.remove() - 1;
        	if(temp > 0) {
	        	ticketsQueue.add(temp);
        	}
        	else {
        		loop++;
        	}
        	
    	}
    	
    	return 0;
    }
}
//